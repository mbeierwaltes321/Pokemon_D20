package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pokemon_habitats")
public class PokemonHabitats {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int pokemonHabitatId;

    @ColumnInfo(name = "identifier")
    private String pokemonHabitatIdentifier;

    public int getPokemonHabitatId() {
        return pokemonHabitatId;
    }

    public void setPokemonHabitatId(int pokemonHabitatId) {
        this.pokemonHabitatId = pokemonHabitatId;
    }

    public String getPokemonHabitatIdentifier() {
        return pokemonHabitatIdentifier;
    }

    public void setPokemonHabitatIdentifier(String pokemonHabitatIdentifier) {
        this.pokemonHabitatIdentifier = pokemonHabitatIdentifier;
    }
}
