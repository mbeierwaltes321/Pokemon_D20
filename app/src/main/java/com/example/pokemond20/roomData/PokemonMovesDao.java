package com.example.pokemond20.roomData;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.pokemond20.queryData.MoveListTuple;
import com.example.pokemond20.queryData.PokemonListTuple;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

@Dao
public interface PokemonMovesDao {

    @Query("SELECT DISTINCT pokemon_identifier, pokemon_id, move_id, move_identifier " +
            "FROM pokemon_moves INNER JOIN moves " +
            "ON move_id = moves.id INNER JOIN pokemon " +
            "ON pokemon_id = pokemon.id WHERE pokemon_id = (:pokemonId);")
    ListenableFuture<List<MoveListTuple>> pkmnToMoves(int pokemonId);

    @Query("SELECT DISTINCT pokemon_identifier, pokemon_id, move_id, move_identifier " +
            "FROM pokemon_moves INNER JOIN moves " +
            "ON move_id = moves.id INNER JOIN pokemon " +
            "ON pokemon_id = pokemon.id WHERE pokemon_identifier = (:pokemonName);")
    ListenableFuture<List<MoveListTuple>> pkmnToMoves(String pokemonName);

    @Query("SELECT DISTINCT pokemon_id, move_id, pokemon_identifier " +
            "FROM pokemon_moves INNER JOIN pokemon " +
            "ON pokemon_id = pokemon.id WHERE move_id = (:moveId);")
    ListenableFuture<List<PokemonListTuple>> moveIdToPkmn(int moveId);

}
