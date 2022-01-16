package com.example.pokemond20.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.pokemond20.R;
import com.example.pokemond20.roomData.PokemonRepository;
import com.example.pokemond20.roomData.daos.PokemonDao;
import com.example.pokemond20.roomData.entities.Pokemon;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public class MovesToPokemonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moves_to_pokemon);
    }

    public void testDatabase(View view) {
        PokemonRepository repo = new PokemonRepository(this.getApplication());
        ListenableFuture<List<PokemonDao.PokemonListTuple>> tacklePokemon = repo.getPokemonWithMove("tackle");
        try {
            Log.i("Pokemon:\n", tacklePokemon.get().toString());
        } catch (Exception e) {
            Log.e("ERROR", e.toString());
        }
    }
}