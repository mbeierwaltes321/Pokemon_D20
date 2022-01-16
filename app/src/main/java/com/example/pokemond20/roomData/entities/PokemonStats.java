package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

@Entity(tableName = "pokemon_stats",
        primaryKeys = {"pokemon_id", "stat_id"})
public class PokemonStats {
    @ColumnInfo(name = "pokemon_id")
    private int pkmnStatsPokemonId;

    @ColumnInfo(name = "stat_id")
    private int pkmnStatsStatId;

    @ColumnInfo(name = "base_stat")
    private int baseStat;

    
    @ColumnInfo(name = "effort")
    private int effort;

    public int getPkmnStatsPokemonId() {
        return pkmnStatsPokemonId;
    }

    public void setPkmnStatsPokemonId(int pkmnStatsPokemonId) {
        this.pkmnStatsPokemonId = pkmnStatsPokemonId;
    }

    public int getPkmnStatsStatId() {
        return pkmnStatsStatId;
    }

    public void setPkmnStatsStatId(int pkmnStatsStatId) {
        this.pkmnStatsStatId = pkmnStatsStatId;
    }

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }
}
