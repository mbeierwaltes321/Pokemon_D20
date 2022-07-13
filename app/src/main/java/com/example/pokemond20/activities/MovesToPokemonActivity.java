package com.example.pokemond20.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.pokemond20.PokemonViewModel;
import com.example.pokemond20.R;
import com.example.pokemond20.recyclerView.PokemonListAdapter;
import com.example.pokemond20.roomData.PokemonRepository;
import com.example.pokemond20.roomData.daos.PokemonDao;
import com.example.pokemond20.roomData.entities.Pokemon;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public class MovesToPokemonActivity extends AppCompatActivity {

    PokemonViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moves_to_pokemon);
        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);

        //TODO - Convert EditText to AutoCompleteTextView with names of pokemon
    }

    public void moveToPokemon(View view) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvPokemonList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // TODO - Add indication that the task is loading

        new Thread(() -> {
            // Obtains name of move from user, queries database, and lists
            // the Pokemon that can use them
            try {
                final String moveName = ((EditText) findViewById(R.id.etxtMoveInput))
                        .getText().toString().toLowerCase();

                List<PokemonDao.PokemonListTuple> pokemonList =
                        viewModel.getPokemonFromMove(moveName).get();

                recyclerView.post(() -> {
                    PokemonListAdapter adapter = new PokemonListAdapter(pokemonList);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(layoutManager);
                });

            } catch (Exception e) {
                Log.e("\nERROR: ", e.toString());
            }
        }).start();
    }

}