package com.example.pokemond20.roomData.daos;

import android.content.Context;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.pokemond20.R;
import com.example.pokemond20.roomData.entities.Moves;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

@Dao
public interface MovesDao {
    @Query("SELECT * FROM moves")
    ListenableFuture<List<Moves>> getAllMoves();

    /* TODO - Change query and database to allow for more user friendliness
            1. Add move_names to database and Room
            2. Display English names from move_names instead of the identifiers from moves
            3. Replace pokemon.identifier with species from pokemon_species
     */
    @Query("SELECT DISTINCT pokemon.identifier AS \"Name\", pokemon_id AS \"Pokemon ID\",\n" +
            "move_id AS \"Move ID\" , moves.identifier AS \"Move Name\"\n" +
            "FROM pokemon_moves INNER JOIN moves\n" +
            "ON move_id = moves.id INNER JOIN pokemon\n" +
            "ON pokemon_id = pokemon.id WHERE pokemon.identifier = :pokemonName")
    ListenableFuture<List<MoveListTuple>> moveListFrom(String pokemonName);

    // Object for returned moves
    static class MoveListTuple {
        @ColumnInfo(name = "Name")
        private String pokemonName;

        @ColumnInfo(name = "Pokemon ID")
        private String pokemonID;

        @ColumnInfo(name = "Move ID")
        private String moveID;

        @ColumnInfo(name = "Move Name")
        private String moveName;

        public String getPokemonName() {
            return pokemonName;
        }

        public void setPokemonName(String pokemonName) {
            this.pokemonName = pokemonName;
        }

        public String getPokemonID() {
            return pokemonID;
        }

        public void setPokemonID(String pokemonID) {
            this.pokemonID = pokemonID;
        }

        public String getMoveID() {
            return moveID;
        }

        public void setMoveID(String moveID) {
            this.moveID = moveID;
        }

        public String getMoveName() {
            return moveName;
        }

        public void setMoveName(String moveName) {
            this.moveName = moveName;
        }
    }
}


