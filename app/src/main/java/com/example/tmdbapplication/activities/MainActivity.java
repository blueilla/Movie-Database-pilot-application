package com.example.tmdbapplication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tmdbapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void renderSearchPage(View view) {
        Intent intent = new Intent(this, SearchByIDActivity.class);
        startActivity(intent);
    }

    public void renderDiscoverPage(View view) {
        Intent intent = new Intent(this, DiscoverActivity.class);
        startActivity(intent);
    }
}
