package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "regions")
public class Regions {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int regionId;

    @ColumnInfo(name = "identifier")
    private String regionIdentifier;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionIdentifier() {
        return regionIdentifier;
    }

    public void setRegionIdentifier(String regionIdentifier) {
        this.regionIdentifier = regionIdentifier;
    }
}
