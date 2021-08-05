package com.example.pokemond20;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.pokemond20.data.*;
import java.util.List;

public class ListViewModel extends AndroidViewModel {
    private PokemonRepository pokemonRepository;

    private List<Pokemon> pokemonList;
    private LiveData<List<Moves>> moveList;

    public ListViewModel(Application application) {
        super(application);
        pokemonRepository = new PokemonRepository(application);
        moveList = pokemonRepository.getMovesList();
    }

    LiveData<List<Moves>> getMoveList() { return moveList; }

}
