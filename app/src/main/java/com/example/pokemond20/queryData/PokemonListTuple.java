package com.example.pokemond20.queryData;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;

public class PokemonListTuple {
    @ColumnInfo(name= "pokemon_id")
    @NonNull
    public int PokemonId;

    @ColumnInfo(name= "move_id")
    @NonNull
    public int MoveId;

    @ColumnInfo(name= "pokemon_identifier")
    public String identifier;
}

