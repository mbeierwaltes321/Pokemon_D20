package com.example.pokemond20.data;

import androidx.room.*;

@Entity(tableName = "pokemon_moves")
public class PokemonMoves {
    private int pokemon_id;
    private int move_id;
    private int level;
    private int order;

    @Ignore int version_group_id;
    @Ignore int pokemon_move_method_id;

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
}
