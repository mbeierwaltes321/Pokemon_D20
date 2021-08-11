package com.example.pokemond20.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "moves")
public class Moves {
    // Columns of database
    @PrimaryKey
    @ColumnInfo(name="id")
    private int id;

    @ColumnInfo(name="identifier")
    private String identifier;

    public int getId() { return id; }
    public String getIdentifier() { return identifier; }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
