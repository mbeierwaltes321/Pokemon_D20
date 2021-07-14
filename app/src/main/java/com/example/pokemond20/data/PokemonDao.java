package com.example.pokemond20.data;

import androidx.room.*;

@Dao
public interface PokemonDao {
    @Query("SELECT * FROM pokemon WHERE id = (:id) ")
    Pokemon getPokemon(int id);

    @Query("SELECT * FROM pokemon WHERE identifier = (:name)")
    Pokemon getPokemon(String name);

}
