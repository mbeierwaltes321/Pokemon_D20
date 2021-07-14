package com.example.pokemond20.data;

import androidx.room.*;

@Entity(tableName = "moves")
public class Moves {
    // Columns of database
    @PrimaryKey
    private int id;
    private String identifier;

    @Ignore int generation_id;
    @Ignore int type_id;
    @Ignore String power;
    @Ignore int pp;
    @Ignore int accuracy;
    @Ignore int priority;
    @Ignore int target_id;
    @Ignore int damage_class_id;
    @Ignore int effect_id;
    @Ignore String effect_chance;
    @Ignore int contest_type_id;
    @Ignore int contest_effect_id;
    @Ignore int super_contest_effect_id;

    // Getters
    public int getId() { return id; }
    public String getIdentifier() { return identifier; }

}
