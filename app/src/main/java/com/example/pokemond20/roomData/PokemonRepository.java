package com.example.pokemond20.roomData;

import android.app.Application;
import androidx.room.Room;

import com.example.pokemond20.queryData.MoveListTuple;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

public class PokemonRepository {
    private MovesDao movesDao;
    private ListenableFuture<List<MoveListTuple>> pkmnMovesList;

    private PokemonDao pokemonDao;
    private PokemonMovesDao pokemonMovesDao;

    public PokemonRepository(Application application) {
        AppDatabase db = Room.databaseBuilder(application.getApplicationContext(),
                AppDatabase.class, "pokemon_d20_internal_database.db")
                .createFromAsset("database/pokemon_d20_database.db")
                .build();

        movesDao = db.movesDao();
        pokemonDao = db.pokemonDao();
        pokemonMovesDao = db.pokemonMovesDao();
    }

    public ListenableFuture<List<MoveListTuple>> getMovesFromPkmn(int id) {
        pkmnMovesList = pokemonMovesDao.pkmnToMoves(id);
        return pkmnMovesList;
    }

    public ListenableFuture<List<MoveListTuple>> getMovesFromPkmn(String name) {
        pkmnMovesList = pokemonMovesDao.pkmnToMoves(name);
        return pkmnMovesList;
    }
}
