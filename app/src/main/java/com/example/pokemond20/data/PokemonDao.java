package com.example.pokemond20.data;

import androidx.room.Dao;
import androidx.room.Query;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

@Dao
public interface PokemonDao {
    @Query("SELECT * FROM pokemon WHERE id = (:id) ")
    ListenableFuture<List<Pokemon>> getPokemon(int id);

    @Query("SELECT * FROM pokemon WHERE identifier = (:name)")
    ListenableFuture<List<Pokemon>> getPokemon(String name);
}
