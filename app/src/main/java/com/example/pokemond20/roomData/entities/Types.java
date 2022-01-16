package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "types")
public class Types {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int typeId;

    @ColumnInfo(name = "identifier")
    private String typeIdentifier;

    
    @ColumnInfo(name = "generation_id")
    private int typesGenerationId;

    
    @ColumnInfo(name = "damage_class_id")
    private String typesDamageClassId;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeIdentifier() {
        return typeIdentifier;
    }

    public void setTypeIdentifier(String typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
    }

    public int getTypesGenerationId() {
        return typesGenerationId;
    }

    public void setTypesGenerationId(int typesGenerationId) {
        this.typesGenerationId = typesGenerationId;
    }

    public String getTypesDamageClassId() {
        return typesDamageClassId;
    }

    public void setTypesDamageClassId(String typesDamageClassId) {
        this.typesDamageClassId = typesDamageClassId;
    }
}
