package com.example.lesson5android3.data.network;

import com.example.lesson5android3.data.model.FilmModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FilmApi {

    @GET("films")
    Call<List<FilmModel>> getUsers();
}
