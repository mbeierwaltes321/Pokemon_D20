package com.example.pokemond20.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.pokemond20.R;

public class NewStatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_stats);
    }

    public void generateStats(View view) {

        // Makes the stats layout visible to user
        LinearLayout statsLayout = (LinearLayout) findViewById(R.id.statsLayout);
        statsLayout.setVisibility(View.VISIBLE);
    }

}