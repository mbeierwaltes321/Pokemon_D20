package com.example.pokemond20.data;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import java.util.List;

@Dao
public interface PokemonDao {
    @Query("SELECT * FROM pokemon WHERE id = (:id) ")
    LiveData<List<Pokemon>> getPokemon(int id);

    @Query("SELECT * FROM pokemon WHERE identifier = (:name)")
    LiveData<List<Pokemon>> getPokemon(String name);
}
