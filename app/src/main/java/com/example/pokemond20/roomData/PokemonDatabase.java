package com.example.pokemond20.roomData;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.pokemond20.roomData.daos.MovesDao;
import com.example.pokemond20.roomData.daos.PokemonDao;
import com.example.pokemond20.roomData.entities.*;

//TODO - In all of the entities, replace nullable ints with Integers
//  this will allow for nullable integers.
@Database(entities =
        {Generations.class, MoveNames.class, Moves.class, Pokemon.class, PokemonHabitats.class,
        PokemonMoves.class, PokemonSpecies.class, PokemonSpeciesNames.class, PokemonStats.class,
        Regions.class, Stats.class, Types.class}, version = 1)
public abstract class PokemonDatabase extends RoomDatabase {
    public abstract MovesDao movesDao();
    public abstract PokemonDao pokemonDao();
}