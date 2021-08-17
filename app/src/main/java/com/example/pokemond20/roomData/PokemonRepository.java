package com.example.pokemond20.roomData;

import android.app.Application;
import androidx.room.Room;

import com.example.pokemond20.queryData.MoveListTuple;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

public class PokemonRepository {
    private MovesDao movesDao;
//    private ListenableFuture<List<Moves>> movesList;
//    private ListenableFuture<List<Moves>> allMovesList;
    private ListenableFuture<List<MoveListTuple>> pkmnMovesList;

    private PokemonDao pokemonDao;
    private PokemonMovesDao pokemonMovesDao;

    public PokemonRepository(Application application) {
        AppDatabase db = Room.databaseBuilder(application.getApplicationContext(),
                AppDatabase.class, "pokemon_d20_database.db")
                .createFromAsset("database/android_d20_database.db")
                .build();

        movesDao = db.movesDao();
        pokemonDao = db.pokemonDao();
        pokemonMovesDao = db.pokemonMovesDao();

        //IMPORTANT - As of right now, this returns only bulbasaur's moves
//        movesList = movesDao.getMove(1);
//        allMovesList = movesDao.getAllMoves();
    }

//    public ListenableFuture<List<Moves>> getMovesList() { return movesList; }
//    public ListenableFuture<List<Moves>> getAllMoves() { return allMovesList; }

    public ListenableFuture<List<MoveListTuple>> getMovesFromPkmn(int id) {
        pkmnMovesList = pokemonMovesDao.pkmnIdToMoves(id);
        return pkmnMovesList;
    }
}
