package com.gordeev;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Weather {
    private Weather() {};

    public static final String HOST = "https://api.weatherapi.com";
    public static final String KEY = " =) ";

    private static WeatherAPI api;

    private static WeatherAPI init() {
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(WeatherAPI.class);
    }

    public static WeatherAPI instance() {
        if (api == null) {
            api = init();
        }
        return api;
    }
}
