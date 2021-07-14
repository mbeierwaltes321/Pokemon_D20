package com.example.pokemond20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.*;
import com.example.pokemond20.data.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    AppDatabase db = Room.databaseBuilder(getApplicationContext(),
            AppDatabase.class, "pkmn_d20_database")
            .createFromAsset("pkmn_d20_database.db")
            .build();


    /* TODO: Add functionality to buttons that lead to other activities
    1. Activity - Select Pokemon, show moves
    2. Activity - Select move, show Pokemon
    */

}