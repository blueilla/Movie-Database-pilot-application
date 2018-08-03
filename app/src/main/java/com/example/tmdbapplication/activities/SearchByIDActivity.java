package com.example.tmdbapplication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tmdbapplication.R;
import com.example.tmdbapplication.model.Movie;
import com.example.tmdbapplication.service.MovieDatabaseClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchByIDActivity extends AppCompatActivity {

    EditText searchInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_id);
    }

    public void searchByID(View view) {

        searchInput = findViewById(R.id.editText);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        MovieDatabaseClient client = retrofit.create(MovieDatabaseClient.class);
        Call<Movie> call = client.getMovieById(searchInput.getText().toString());

        call.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                Movie movie = response.body();
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                Toast.makeText(SearchByIDActivity.this, "error :(", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
