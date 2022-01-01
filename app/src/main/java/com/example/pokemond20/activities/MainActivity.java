package com.example.pokemond20.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pokemond20.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the user taps the "Moves" button
    public void pokemonToMoves(View view) {
        Intent intent = new Intent(this, PokemonToMovesActivity.class);
        startActivity(intent);
    }

    // Called when the user taps the "Pokemon" button
    public void movesToPokemon(View view) {
        Intent intent = new Intent(this, MovesToPokemonActivity.class);
        startActivity(intent);
    }

    public void toStatsActivity(View view) {
        Intent intent = new Intent(this, NewStatsActivity.class);
        startActivity(intent);
    }

}