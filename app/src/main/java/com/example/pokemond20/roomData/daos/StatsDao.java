package com.example.pokemond20.roomData.daos;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.pokemond20.roomData.entities.Stats;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

@Dao
public interface StatsDao {
    @Query("SELECT * FROM stats")
    ListenableFuture<List<Stats>> getAllStats();

    @Query("SELECT * FROM pokemon_stats")
    ListenableFuture<List<Stats>> getAllPokemonStats();

    final String statsFromPokemonQuery
            = "SELECT DISTINCT pokemon.identifier AS \"Name\", " +
            "stats.identifier AS \"Stat Name\", pokemon_stats.base_stat AS \"Base Stat Value\"\n" +
            "FROM pokemon_stats INNER JOIN stats ON pokemon_stats.stat_id = stats.id\n" +
            "INNER JOIN pokemon ON pokemon_stats.pokemon_id = pokemon.id\n" +
            "WHERE pokemon.identifier = :pokemonName;";

    @Query(statsFromPokemonQuery)
    ListenableFuture<List<pokemonStatsTuple>> getStatsFor(String pokemonName);

    // Object for Stats value
    static class pokemonStatsTuple {
        @ColumnInfo(name = "Name")
        private String pokemonName;

        @ColumnInfo(name = "Stat Name")
        private String statName;

        @ColumnInfo(name = "Base Stat Value")
        private int baseStatValue;

        public String getPokemonName() {
            return pokemonName;
        }

        public void setPokemonName(String pokemonName) {
            this.pokemonName = pokemonName;
        }

        public String getStatName() {
            return statName;
        }

        public void setStatName(String statName) {
            this.statName = statName;
        }

        public int getBaseStatValue() {
            return baseStatValue;
        }

        public void setBaseStatValue(int baseStatValue) {
            this.baseStatValue = baseStatValue;
        }
    }



}
