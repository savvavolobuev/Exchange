package service;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import com.j256.ormlite.android.apptools.OpenHelperManager;

import api.RateClient;
import api.data.Rate;
import db.OpenDatabaseHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by savva.volobuev on 13.03.2017.
 */

public class RatePullService extends IntentService {

    public static final String DATA_INTENT_BASE = "DATA_INTENT_BASE";
    public static final String BROADCAST_ACTION = "home.savvavolobuev.exchange.BROADCAST";
    public static final String BROADCAST_ACTION_STATUS = "home.savvavolobuev.exchange.BROADCAST_ACTION_STATUS";
    public static final String STATUS_OK = "STATUS_OK";
    public static final String STATUS_FAILED = "STATUS_FAILED";

    public RatePullService() {
        super("RatePullService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("onHandleIntent", "started ");
        String base = intent.getStringExtra(DATA_INTENT_BASE);
        Call<Rate> call = RateClient.getRateService().getLatestRate(base);
        call.enqueue(new Callback<Rate>() {
            @Override
            public void onResponse(Call<Rate> call, Response<Rate> response) {
                OpenDatabaseHelper openDatabaseHelper = OpenHelperManager.getHelper(getApplicationContext(),
                        OpenDatabaseHelper.class);
                openDatabaseHelper.getRateDao().createOrUpdateRate(response.body());
                Intent localIntent = new Intent(BROADCAST_ACTION);
                localIntent.putExtra(BROADCAST_ACTION_STATUS, STATUS_OK);
                LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(localIntent);
                Log.d("RatePullService", "Success ");
            }

            @Override
            public void onFailure(Call<Rate> call, Throwable t) {
                Intent localIntent = new Intent(BROADCAST_ACTION);
                localIntent.putExtra(BROADCAST_ACTION_STATUS, STATUS_FAILED);
                LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(localIntent);
                Log.d("RatePullService", "Failed ");
            }
        });
    }
}
