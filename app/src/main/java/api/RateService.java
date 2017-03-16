package api;

import api.data.Rate;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by savva.volobuev on 13.03.2017.
 */

public interface RateService {

    @GET("/latest")
    Call<Rate> getLatestRate(@Query("base") String currency);
}
