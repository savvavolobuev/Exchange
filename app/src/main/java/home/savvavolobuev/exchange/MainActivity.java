package home.savvavolobuev.exchange;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.j256.ormlite.android.apptools.OpenHelperManager;

import db.OpenDatabaseHelper;
import db.table.Rate;
import service.RatePullService;

public class MainActivity extends AppCompatActivity {

    private Spinner title;
    private EditText value;
    private Spinner titleConvert;
    private EditText valueConvert;
    private Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (Spinner) findViewById(R.id.title);
        value = (EditText) findViewById(R.id.value);
        titleConvert = (Spinner) findViewById(R.id.title_convert);
        valueConvert = (EditText) findViewById(R.id.value_convert);
        handler = new Handler();

        LocalBroadcastManager.getInstance(this).registerReceiver(messageReceiver,
                new IntentFilter(RatePullService.BROADCAST_ACTION));
    }

    private void initView() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Rate.allRater);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        title.setAdapter(adapter);
        title.setPrompt("USD");
        title.setSelection(0);
        titleConvert.setAdapter(adapter);
        titleConvert.setPrompt("EUR");
        titleConvert.setSelection(Rate.allRater.length - 1);
        AdapterView.OnItemSelectedListener listener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                value.setText("");
                valueConvert.setText("");
                postRunService(0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        title.setOnItemSelectedListener(listener);
        titleConvert.setOnItemSelectedListener(listener);


        value.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!TextUtils.isEmpty(s)) {
                    updateRateTextView();
                }
            }

            private void updateRateTextView() {
                new AsyncTask<Object, Object, db.table.Rate>() {

                    private String currentTitle;
                    private String convertTitle;


                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        currentTitle = title.getSelectedItem().toString();
                        convertTitle = titleConvert.getSelectedItem().toString();
                    }

                    @Override
                    protected db.table.Rate doInBackground(Object... params) {
                        OpenDatabaseHelper openDatabaseHelper = OpenHelperManager.getHelper(getApplicationContext(),
                                OpenDatabaseHelper.class);
                        return openDatabaseHelper.getRateDao().getRate(currentTitle.toUpperCase());

                    }

                    @Override
                    protected void onPostExecute(db.table.Rate rate) {
                        if (rate != null) {
                            valueConvert.setText(rate.matchValue(convertTitle.toLowerCase()) * Double.parseDouble(value.getText().toString()) + "");
                        } else {
                            Toast.makeText(MainActivity.this, "what for data loading", Toast.LENGTH_SHORT).show();
                        }

                    }
                }.execute();

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        initView();
        postRunService(1000);
    }



    private void postRunService(final long delay) {
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          final Intent serviceIntent = new Intent(MainActivity.this, RatePullService.class);
                                          serviceIntent.putExtra(RatePullService.DATA_INTENT_BASE, title.getSelectedItem().toString());
                                          startService(serviceIntent);
                                      }
                                  }
                , delay);
    }


    private BroadcastReceiver messageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String message = intent.getStringExtra(RatePullService.BROADCAST_ACTION_STATUS);
            Log.d("receiver", "Got message: " + message);
            postRunService(30 * 1000);
        }
    };

    @Override
    protected void onDestroy() {
        handler.removeCallbacksAndMessages(null);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(messageReceiver);
        super.onDestroy();
    }
}
