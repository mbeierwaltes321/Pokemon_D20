package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "pokemon")
public class Pokemon {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int pokemonId;

    @ColumnInfo(name = "identifier")
    private String pokemonIdentifier;

    @ColumnInfo(name = "species_id")
    private int pokemonSpeciesId;

    
    @ColumnInfo(name = "height")
    private int height;

    
    @ColumnInfo(name = "weight")
    private int weight;

    
    @ColumnInfo(name = "base_experience")
    private int baseExperience;

    
    @ColumnInfo(name = "order")
    private int order;

    @ColumnInfo(name = "is_default")
    private int isDefault;

    public int getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getPokemonIdentifier() {
        return pokemonIdentifier;
    }

    public void setPokemonIdentifier(String pokemonIdentifier) {
        this.pokemonIdentifier = pokemonIdentifier;
    }

    public int getPokemonSpeciesId() {
        return pokemonSpeciesId;
    }

    public void setPokemonSpeciesId(int pokemonSpeciesId) {
        this.pokemonSpeciesId = pokemonSpeciesId;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }
}
