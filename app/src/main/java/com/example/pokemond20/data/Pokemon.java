package com.example.pokemond20.data;

import androidx.room.*;

@Entity(tableName = "pokemon")
public class Pokemon {
    // Columns of database
    @PrimaryKey
    private int id;
    private String identifier;

    @Ignore
    private int species_id;
    @Ignore
    private int height;
    @Ignore
    private int weight;
    @Ignore
    private int base_experience;
    @Ignore
    private int order;
    @Ignore
    private int is_default;

    // Proper getters
    public int getId() {
        return id;
    }

    public String getIdentifier() {
        return identifier;
    }
}
