package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

/*
TODO: Database and code changes:
If possible, set up pokemon_id and move_id to be foreign keys.
This may get rid of the primary key requirement.
If it doesn't, then you must make a unique pokemon_move id column in the database

Database changes:
    pokemon_id and move_id need to be primary keys
Code changes:
 */

@Entity(tableName = "pokemon_moves",
        primaryKeys = {"pokemon_id", "move_id"})
public class PokemonMoves {

    @ColumnInfo(name = "pokemon_id")
    private int pkmnMovesPokemonId;

    
    @ColumnInfo(name = "version_group_id")
    private int versionGroupId;

    @ColumnInfo(name = "move_id")
    private int pkmnMovesMoveId;

    
    @ColumnInfo(name = "pokemon_move_method_id")
    private int pokemonMoveMethodId;

    
    @ColumnInfo(name = "level")
    private int level;

    
    @ColumnInfo(name = "order")
    private String pkmnMovesOrder;

    public int getPkmnMovesPokemonId() {
        return pkmnMovesPokemonId;
    }

    public void setPkmnMovesPokemonId(int pkmnMovesPokemonId) {
        this.pkmnMovesPokemonId = pkmnMovesPokemonId;
    }

    public int getVersionGroupId() {
        return versionGroupId;
    }

    public void setVersionGroupId(int versionGroupId) {
        this.versionGroupId = versionGroupId;
    }

    public int getPkmnMovesMoveId() {
        return pkmnMovesMoveId;
    }

    public void setPkmnMovesMoveId(int pkmnMovesMoveId) {
        this.pkmnMovesMoveId = pkmnMovesMoveId;
    }

    public int getPokemonMoveMethodId() {
        return pokemonMoveMethodId;
    }

    public void setPokemonMoveMethodId(int pokemonMoveMethodId) {
        this.pokemonMoveMethodId = pokemonMoveMethodId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPkmnMovesOrder() {
        return pkmnMovesOrder;
    }

    public void setPkmnMovesOrder(String pkmnMovesOrder) {
        this.pkmnMovesOrder = pkmnMovesOrder;
    }
}
