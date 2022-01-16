package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "generations")
public class Generations {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int generationId;

    @ColumnInfo(name = "main_region_id")
    private int mainRegionId;


    @ColumnInfo(name = "identifier")
    private String generationRegionIdentifier;

    public int getGenerationId() {
        return generationId;
    }

    public void setGenerationId(int generationId) {
        this.generationId = generationId;
    }

    public int getMainRegionId() {
        return mainRegionId;
    }

    public void setMainRegionId(int mainRegionId) {
        this.mainRegionId = mainRegionId;
    }

    public String getGenerationRegionIdentifier() {
        return generationRegionIdentifier;
    }

    public void setGenerationRegionIdentifier(String generationRegionIdentifier) {
        this.generationRegionIdentifier = generationRegionIdentifier;
    }
}
