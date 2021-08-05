package com.example.pokemond20.data;

import androidx.room.*;

@Entity(tableName = "pokemon")
public class Pokemon {
    // Columns of database
    @PrimaryKey
    private int id;
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
