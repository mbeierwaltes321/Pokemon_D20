package com.example.pokemond20.roomData.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "pokemon_species_names",
    primaryKeys = {"pokemon_species_id", "local_language_id", "name"})
public class PokemonSpeciesNames {
    @ColumnInfo(name = "pokemon_species_id")
    private int pokemonSpeciesId;

    @ColumnInfo(name = "local_language_id")
    private int localLanguageId;

    @NonNull
    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "genus")
    private String genus;

    public int getPokemonSpeciesId() {
        return pokemonSpeciesId;
    }

    public void setPokemonSpeciesId(int pokemonSpeciesId) {
        this.pokemonSpeciesId = pokemonSpeciesId;
    }

    public int getLocalLanguageId() {
        return localLanguageId;
    }

    public void setLocalLanguageId(int localLanguageId) {
        this.localLanguageId = localLanguageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }
}
