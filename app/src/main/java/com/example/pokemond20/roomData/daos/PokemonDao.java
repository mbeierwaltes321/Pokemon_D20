package com.example.pokemond20.roomData.daos;

import android.content.res.Resources;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.pokemond20.R;
import com.example.pokemond20.roomData.entities.Pokemon;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

@Dao
public interface PokemonDao {
    @Query("SELECT * FROM pokemon")
    ListenableFuture<List<Pokemon>> getAllPokemon();

    @Query("SELECT identifier FROM pokemon WHERE pokemon.is_default = true ORDER BY species_id ASC")
    ListenableFuture<List<String>> getAllPokemonIdentifiers();


    final String query
            = "SELECT DISTINCT move_names.move_id AS \"Move ID\", move_names.name AS \"Move Identifier\",\n" +
            "pokemon_species_names.pokemon_species_id AS \"Pokemon ID\", pokemon_species_names.name AS \"Pokemon Identifier\"\n" +
            "FROM pokemon_moves INNER JOIN move_names ON pokemon_moves.move_id = move_names.move_id \n" +
            "INNER JOIN pokemon ON pokemon_moves.pokemon_id = pokemon.id\n" +
            "INNER JOIN pokemon_species_names ON pokemon_species_names.pokemon_species_id = pokemon.species_id\n" +
            "WHERE LOWER(move_names.name) = :moveName AND pokemon_species_names.local_language_id = 9;";

    @Query(query)
    ListenableFuture<List<PokemonListTuple>> pokemonListFrom(String moveName);

    static class PokemonListTuple {
        @ColumnInfo(name = "Move ID")
        private int moveId;

        @ColumnInfo(name = "Move Identifier")
        private String moveIdentifier;

        @ColumnInfo(name = "Pokemon ID")
        private int pokemonId;

        @ColumnInfo(name = "Pokemon Identifier")
        private String pokemonIdentifier;

        public int getMoveId() {
            return moveId;
        }

        public void setMoveId(int moveId) {
            this.moveId = moveId;
        }

        public String getMoveIdentifier() {
            return moveIdentifier;
        }

        public void setMoveIdentifier(String moveIdentifier) {
            this.moveIdentifier = moveIdentifier;
        }

        public int getPokemonId() {
            return pokemonId;
        }

        public void setPokemonId(int pokemonId) {
            this.pokemonId = pokemonId;
        }

        public String getPokemonIdentifier() {
            return pokemonIdentifier;
        }

        public void setPokemonIdentifier(String pokemonIdentifier) {
            this.pokemonIdentifier = pokemonIdentifier;
        }
    }
}
