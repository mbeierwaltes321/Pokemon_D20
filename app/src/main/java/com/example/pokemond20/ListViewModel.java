package com.example.pokemond20;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.example.pokemond20.queryData.MoveListTuple;
import com.example.pokemond20.roomData.*;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public class ListViewModel extends AndroidViewModel {
    private PokemonRepository pokemonRepository;

    public ListViewModel(Application application) {
        super(application);
        pokemonRepository = new PokemonRepository(application);
    }

    public ListenableFuture<List<MoveListTuple>> getMovesFromPkmn(int id) {
        return pokemonRepository.getMovesFromPkmn(id);
    }

    public ListenableFuture<List<MoveListTuple>> getMovesFromPkmn(String name) {
        return pokemonRepository.getMovesFromPkmn(name);
    }


}
