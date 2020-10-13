package com.example.lesson5android3.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FilmApiService {
    private static String BASE_URL = "http://ghibliapi.herokuapp.com/";

    protected Retrofit retrofit;
    private static FilmApiService filmApiService;

    public static FilmApiService getInstance() {
        if (filmApiService == null)
            filmApiService = new FilmApiService();
        return filmApiService;
    }

    private FilmApiService() {
        retrofit = new Retrofit.Builder().
                baseUrl(BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).
                build();
    }

    public FilmApi getPostApi() {
        return retrofit.create(FilmApi.class);
    }


}
