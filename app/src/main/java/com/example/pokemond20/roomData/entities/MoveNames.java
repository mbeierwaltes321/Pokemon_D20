package com.example.pokemond20.roomData.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "move_names", primaryKeys = {"move_id", "local_language_id", "name"})
public class MoveNames {
    @ColumnInfo(name = "move_id")
    private int moveId;

    @ColumnInfo(name = "local_language_id")
    private int localLanguageId;

    @NonNull
    @ColumnInfo(name = "name")
    private String name;

    public int getMoveId() {
        return moveId;
    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
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
}
