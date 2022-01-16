package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "stats")
public class Stats {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int statId;

    
    @ColumnInfo(name = "damage_class_id")
    private String statsDamageClassId;

    @ColumnInfo(name = "identifier")
    private String statIdentifier;

    @ColumnInfo(name = "is_battle_only")
    private int isBattleOnly;

    
    @ColumnInfo(name = "game_index")
    private String gameIndex;

    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
    }

    public String getStatsDamageClassId() {
        return statsDamageClassId;
    }

    public void setStatsDamageClassId(String statsDamageClassId) {
        this.statsDamageClassId = statsDamageClassId;
    }

    public String getStatIdentifier() {
        return statIdentifier;
    }

    public void setStatIdentifier(String statIdentifier) {
        this.statIdentifier = statIdentifier;
    }

    public int getIsBattleOnly() {
        return isBattleOnly;
    }

    public void setIsBattleOnly(int isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    public String getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(String gameIndex) {
        this.gameIndex = gameIndex;
    }
}
