package com.example.pokemond20.roomData.daos;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.pokemond20.roomData.entities.Pokemon;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

@Dao
public interface PokemonDao {
    @Query("SELECT * FROM pokemon")
    ListenableFuture<List<Pokemon>> getAllPokemon();

    @Query(
            "SELECT DISTINCT moves.id AS \"Move ID\", moves.identifier AS \"Move Identifier\"," +
            " pokemon.id AS \"Pokemon ID\", pokemon.identifier AS \"Pokemon Identifier\"\n" +
            "FROM moves INNER JOIN pokemon_moves ON \"Move ID\" = pokemon_moves.move_id\n" +
            "INNER JOIN pokemon ON \"Pokemon ID\" = pokemon_moves.pokemon_id\n" +
            "WHERE \"Pokemon Identifier\" = " + ":moveName" + ";"
    ) ListenableFuture<List<PokemonListTuple>> pokemonListFrom(String moveName);

    static class PokemonListTuple {
        @ColumnInfo(name = "Move ID")
        private int moveId;

        @ColumnInfo(name = "Move Identifier")
        private String moveIdentifier;

        @ColumnInfo(name = "Pokemon ID")
        private String pokemonId;

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

        public String getPokemonId() {
            return pokemonId;
        }

        public void setPokemonId(String pokemonId) {
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
