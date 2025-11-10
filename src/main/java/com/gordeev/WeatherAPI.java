package com.gordeev;

import com.gordeev.dto.WeatherResponce;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {
    @GET("/v1/current.json")
    Call<WeatherResponce> current(@Query("key") String APIKey, @Query("q") String city);
}
