package com.example.pokemond20.data;

import androidx.room.*;

@Entity(tableName = "pokemon_moves")
public class PokemonMoves {

    @PrimaryKey(autoGenerate = true)
    private int pokemon_move_id;

    private int pokemon_id;
    private int move_id;
    private int level;
    private int order;

    public int getPokemon_id() {
        return pokemon_id;
    }

    public int getMove_id() {
        return move_id;
    }

    public int getLevel() {
        return level;
    }

    public int getOrder() {
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

    public void setOrder(int order) {
        this.order = order;
    }

    public int getPokemon_move_id() {
        return pokemon_move_id;
    }

    public void setPokemon_move_id(int pokemon_move_id) {
        this.pokemon_move_id = pokemon_move_id;
    }
}
