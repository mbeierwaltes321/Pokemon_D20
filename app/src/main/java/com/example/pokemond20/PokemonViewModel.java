package com.example.pokemond20;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.example.pokemond20.roomData.PokemonRepository;
import com.example.pokemond20.roomData.daos.MovesDao.MoveListTuple;
import com.example.pokemond20.roomData.daos.PokemonDao.PokemonListTuple;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public class PokemonViewModel extends AndroidViewModel {
    private PokemonRepository pokemonRepository ;

    public PokemonViewModel(Application application) {
        super(application);
        pokemonRepository = new PokemonRepository(application);
    }

    //TODO - Add method for getting all the pokemon identifiers

    public ListenableFuture<List<MoveListTuple>> getMovesFromPkmn(String name) {
            return pokemonRepository.getMovesFromPkmn(name);
    }

    public ListenableFuture<List<PokemonListTuple>> getPokemonFromMove(String name) {
            return pokemonRepository.getPokemonWithMove(name);
    }

    public ListenableFuture<List<String>> getAllPokemonIdentifiers() {
        return pokemonRepository.getAllPokemonIdentifiers();
    }

    //TODO - Add method for Pokemon Stats. Here is where the "IVs" should be calculated


}
