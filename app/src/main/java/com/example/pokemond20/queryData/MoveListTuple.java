package com.example.pokemond20.queryData;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;

public class MoveListTuple {
    @ColumnInfo(name= "pokemon_identifier")
    private String pokemonIdentifier;

    @ColumnInfo(name = "pokemon_id")
    @NonNull
    private int pokemonId;

    @ColumnInfo(name = "move_id")
    @NonNull
    private int moveId;

    @ColumnInfo(name = "move_identifier")
    private String moveIdentifier;

    public String getPokemonIdentifier() {
        return this.pokemonIdentifier;
    }

    public int getPokemonId() {
        return this.pokemonId;
    }

    public int getMoveId() {
        return this.moveId;
    }

    public String getMoveIdentifier() {
        return this.moveIdentifier;
    }

    public void setPokemonIdentifier(String pokemonIdentifier) {
        this.pokemonIdentifier = pokemonIdentifier;
    }

    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
    }

    public void setMoveIdentifier(String moveIdentifier) {
        this.moveIdentifier = moveIdentifier;
    }
}


