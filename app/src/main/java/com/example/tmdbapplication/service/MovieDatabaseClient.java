package com.example.tmdbapplication.service;

import com.example.tmdbapplication.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface MovieDatabaseClient {

    @GET("/3/movie/{movieId}?api_key=3fd20438213e8f9af28e4c35a1bdbf45&language=en-US")
    Call<Movie> getMovieById(@Path("movieId") String movieId);
}
