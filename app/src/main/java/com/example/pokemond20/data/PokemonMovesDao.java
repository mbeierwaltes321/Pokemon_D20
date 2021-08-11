package com.example.pokemond20.data;
import androidx.room.Dao;
import androidx.room.Query;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

@Dao
public interface PokemonMovesDao {
    @Query("SELECT DISTINCT * FROM pokemon_moves " +
            "WHERE pokemon_id = (:pokemonId); ")
    ListenableFuture<List<PokemonMoves>> pkmnIdToMoves(int pokemonId);


    @Query("SELECT DISTINCT * FROM pokemon_moves " +
            "WHERE move_id = (:moveId);")
    ListenableFuture<List<PokemonMoves>> moveIdToPkmn(int moveId);
}
