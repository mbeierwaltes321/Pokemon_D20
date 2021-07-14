package com.example.pokemond20.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Moves.class, Pokemon.class, PokemonMoves.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MovesDao movesDao();
    public abstract PokemonDao pokemonDao();
    public abstract PokemonMovesDao pokemonMovesDao();
}
