package com.example.pokemond20.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import com.example.pokemond20.PokemonViewModel;
import com.example.pokemond20.R;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public class NewStatsActivity extends AppCompatActivity {
    PokemonViewModel viewModel;
    List<String> pokemonIdentifiers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_stats);
        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);

        // Set up AutoCompleteTextView
        // TODO - Change so that the Pokemon Name is used instead of the identifiers
        AutoCompleteTextView input = (AutoCompleteTextView) findViewById(R.id.actvNewStatsPokemonName);
        try {
            pokemonIdentifiers = viewModel.getAllPokemonIdentifiers().get();
            new Thread(() -> {
                ArrayAdapter<String> adapter
                        = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,
                        pokemonIdentifiers);
                input.post(() -> {input.setAdapter(adapter);});
            }).start();
        } catch (Exception e) {
            Log.e("ERROR:", e.toString());
        }


    }

    public void generateStats(View view) {
        // Makes the stats layout visible to user
        LinearLayout statsLayout = (LinearLayout) findViewById(R.id.statsLayout);
        statsLayout.setVisibility(View.VISIBLE);


        new Thread(() -> {
            try {
                final String pokemonIdentifier =
                        ((AutoCompleteTextView) findViewById(R.id.actvNewStatsPokemonName))
                                .getText().toString().toLowerCase();

            } catch (Exception e) {
                Log.e("ERROR", e.toString());
            }
        }).start();

    }
}