package com.example.pokemond20.data;
import androidx.room.*;

import java.util.*;

public interface PokemonMovesDao {
    @Query("SELECT DISTINCT pokemon_id, move_id, level, \"order\" FROM pokemon_moves " +
            "WHERE pokemon_id = (:pokemonId); ")
    List<PokemonMoves> pkmnIdToMoves(int pokemonId);

    @Query("SELECT DISTINCT pokemon_id, move_id, level, \"order\" FROM pokemon_moves " +
            "WHERE move_id = (:moveId)")
    List<PokemonMoves> moveIdToPkmn(int moveId);
}
