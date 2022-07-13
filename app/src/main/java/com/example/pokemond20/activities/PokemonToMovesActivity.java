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
import com.example.pokemond20.recyclerView.MovesListAdapter;
import com.example.pokemond20.roomData.daos.MovesDao;

import java.util.List;


public class PokemonToMovesActivity extends AppCompatActivity {

    PokemonViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_to_moves);
        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);
    }

    public void pokemonToMoves(View view) {
        // Grab Recycler View and Layout Manager for displaying the results
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvPokemonMovesList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // Query should be run on background thread
        new Thread(() -> {
            try {

                // Obtain Pokemon name from text box
                final String pokemonName =  ((EditText) findViewById(R.id.etxtPokemonInput))
                        .getText().toString().toLowerCase();

                List<MovesDao.MoveListTuple> moveList =
                        viewModel.getMovesFromPkmn(pokemonName).get();

                recyclerView.post(() -> {
                    MovesListAdapter adapter = new MovesListAdapter(moveList);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(layoutManager);
                });
            } catch (Exception e) {
                Log.e("\nError: ", e.toString());
            }}).start();

    }


}