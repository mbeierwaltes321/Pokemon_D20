package com.example.pokemond20.data;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import java.util.List;

public class PokemonRepository {
    private MovesDao movesDao;
    private LiveData<List<Moves>> movesList;

    private PokemonDao pokemonDao;
    private PokemonMovesDao pokemonMovesDao;

    public PokemonRepository(Application application) {
        AppDatabase db = Room.databaseBuilder(application.getApplicationContext(),
                AppDatabase.class, "pokemon_d20_database.db")
                .createFromAsset("database/android_d20_database.db")
                .build();

        movesDao = db.movesDao();
        // As of right now, this returns only bulbasaur's moves
        movesList = movesDao.getMoves(1);
    }

    public LiveData<List<Moves>> getMovesList() { return movesList; }
}
