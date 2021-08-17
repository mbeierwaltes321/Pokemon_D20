package com.example.pokemond20.roomData;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pokemon_moves")
public class PokemonMoves {

    @PrimaryKey
    private int pokemon_move_id;

    @ColumnInfo(name="pokemon_id")
    @NonNull
    private int pokemon_id;

    @NonNull
    @ColumnInfo(name="move_id")
    private int move_id;

    @NonNull
    @ColumnInfo(name="level")
    private int level;

    @ColumnInfo(name="order")
    private String order;

    public int getPokemon_id() {
        return pokemon_id;
    }

    public int getMove_id() {
        return move_id;
    }

    public int getLevel() {
        return level;
    }

    public String getOrder() {
        return order;
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public void setMove_id(int move_id) {
        this.move_id = move_id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getPokemon_move_id() {
        return pokemon_move_id;
    }

    public void setPokemon_move_id(int pokemon_move_id) {
        this.pokemon_move_id = pokemon_move_id;
    }
}
