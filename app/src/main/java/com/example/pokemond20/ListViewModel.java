package com.example.pokemond20;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import com.example.pokemond20.data.*;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public class ListViewModel extends AndroidViewModel {
    private PokemonRepository pokemonRepository;
    private List<Pokemon> pokemonList;
    private ListenableFuture<List<Moves>> moveList;
    private ListenableFuture<List<Moves>> allMovesList;

    public ListViewModel(Application application) {
        super(application);
        pokemonRepository = new PokemonRepository(application);
        moveList = pokemonRepository.getMovesList();
        allMovesList = pokemonRepository.getAllMoves();
    }

    ListenableFuture<List<Moves>> getMoveList() { return moveList; }
    ListenableFuture<List<Moves>> getAllMoves() { return allMovesList; }

}
