package db.dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

import db.table.Rate;

/**
 * Created by savva.volobuev on 13.03.2017.
 */

public class RateDao extends BaseDaoImpl<Rate, Long> {
    public RateDao(ConnectionSource connectionSource, Class<Rate> dataClass) throws SQLException {
        super(connectionSource, dataClass);
    }

    public Rate getRate(String body) {
        try {
            QueryBuilder<Rate, Long> queryBuilder = queryBuilder();
            queryBuilder.where().eq("base",body);
            PreparedQuery<Rate> preparedQuery = queryBuilder.prepare();
            return queryForFirst(preparedQuery);
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }

    public int createOrUpdateRate(api.data.Rate rateApi) {
        try {
            CreateOrUpdateStatus status = createOrUpdate(new Rate(rateApi));
        } catch (SQLException e) {
            e.getMessage();
        }
        return 0;
    }

}
