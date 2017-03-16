package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import db.dao.RateDao;
import db.table.Rate;

/**
 * Created by savva.volobuev on 13.03.2017.
 */

public class OpenDatabaseHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "auctioneer.db";
    private static final int VERSION = 1;

    private RateDao rateDao;


    public OpenDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Rate.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        if (oldVersion < newVersion) {
            try {
                TableUtils.dropTable(connectionSource, Rate.class, false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public RateDao getRateDao() {
        if (rateDao == null) {
            try {
                rateDao = new RateDao(getConnectionSource(), Rate.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rateDao;
    }

    @Override
    public void close() {
        super.close();
        rateDao = null;
    }

}
