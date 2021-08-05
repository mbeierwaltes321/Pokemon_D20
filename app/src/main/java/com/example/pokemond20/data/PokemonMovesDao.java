package com.example.pokemond20.data;
import androidx.lifecycle.LiveData;
import androidx.room.*;

import java.util.*;

@Dao
public interface PokemonMovesDao {
    @Query("SELECT DISTINCT pokemon_move_id, pokemon_id, " +
            "move_id, level, \"order\" FROM pokemon_moves " +
            "WHERE pokemon_id = (:pokemonId); ")
    LiveData<List<PokemonMoves>> pkmnIdToMoves(int pokemonId);

    @Query("SELECT DISTINCT pokemon_move_id, pokemon_id, move_id, " +
            "level, \"order\" FROM pokemon_moves " +
            "WHERE move_id = (:moveId)")
    LiveData<List<PokemonMoves>> moveIdToPkmn(int moveId);
}
