package com.example.pokemond20.roomData;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import androidx.room.Entity;

@Entity(tableName = "pokemon")
public class Pokemon {
    // Columns of database
    @PrimaryKey
    @ColumnInfo(name="id")
    private int id;

    @ColumnInfo(name="pokemon_identifier")
    private String identifier;

    // Proper getters
    public int getId() {
        return id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
