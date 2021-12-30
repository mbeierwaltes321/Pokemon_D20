package com.example.pokemond20.roomData;

import androidx.room.Database;
import androidx.room.RoomDatabase;

// TODO: Destroy and rebuild current database with sufficient tables
@Database(entities = {Moves.class, Pokemon.class, PokemonMoves.class},
        version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MovesDao movesDao();
    public abstract PokemonDao pokemonDao();
    public abstract PokemonMovesDao pokemonMovesDao();

}


