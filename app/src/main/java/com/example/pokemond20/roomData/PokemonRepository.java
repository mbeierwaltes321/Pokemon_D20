package com.example.pokemond20.roomData;

import android.app.Application;

import androidx.room.Room;

import com.example.pokemond20.roomData.daos.MovesDao;
import com.example.pokemond20.roomData.daos.PokemonDao;
import com.google.common.util.concurrent.ListenableFuture;
import com.example.pokemond20.roomData.daos.MovesDao.MoveListTuple;
import com.example.pokemond20.roomData.daos.PokemonDao.PokemonListTuple;


import java.util.List;


public class PokemonRepository {
    private MovesDao movesDao;
    private PokemonDao pokemonDao;

    public PokemonRepository(Application application) {

        //Database from prepackaged file
        PokemonDatabase db = Room.databaseBuilder(application.getApplicationContext(),
           PokemonDatabase.class, "Pokemon_D20_Database")
           .createFromAsset("database/Source_Pokemon_D20_Database.db")
           .fallbackToDestructiveMigration()
           .build();

        movesDao = db.movesDao();
        pokemonDao = db.pokemonDao();
    }

    public ListenableFuture<List<MoveListTuple>> getMovesFromPkmn(String name) {
        return movesDao.moveListFrom(name);
    }

    public ListenableFuture<List<PokemonListTuple>> getPokemonWithMove(String name) {
        return pokemonDao.pokemonListFrom(name);
    }

    public ListenableFuture<List<String>> getAllPokemonIdentifiers() {
        return pokemonDao.getAllPokemonIdentifiers();
    }
}
