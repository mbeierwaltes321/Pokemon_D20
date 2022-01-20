package com.example.pokemond20.roomData.entities;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Room;
import androidx.room.RoomWarnings;

@SuppressWarnings({RoomWarnings.MISMATCHED_GETTER, RoomWarnings.MISMATCHED_SETTER})
@Entity(tableName = "moves")
public class Moves {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int moveId;

    @ColumnInfo(name = "identifier")
    private String moveIdentifier;

    @ColumnInfo(name = "generation_id")
    private int generationId;

    @ColumnInfo(name = "type_id" )
    private int movesTypeId;

    @ColumnInfo(name = "power")
    @Nullable
    private String power;

    @ColumnInfo(name = "pp")
    @Nullable
    private Integer pp;

    @ColumnInfo(name = "accuracy")
    @Nullable
    private String accuracy;

    @ColumnInfo(name = "priority")
    private int priority;

    @ColumnInfo(name = "target_id")
    private int targetId;

    @ColumnInfo(name = "damage_class_id")
    private int damageClassId;

    @ColumnInfo(name = "effect_id")
    private int effectId;

    @ColumnInfo(name = "effect_chance")
    @Nullable
    private String effectChance;

    @ColumnInfo(name = "contest_type_id")
    @Nullable
    private Integer contestTypeId;

    @ColumnInfo(name = "contest_effect_id")
    @Nullable
    private Integer contestEffectId;

    @ColumnInfo(name = "super_contest_effect_id")
    @Nullable
    private Integer superContestEffectId;

    public int getMoveId() {
        return moveId;
    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
    }

    public String getMoveIdentifier() {
        return moveIdentifier;
    }

    public void setMoveIdentifier(String moveIdentifier) {
        this.moveIdentifier = moveIdentifier;
    }

    public int getGenerationId() {
        return generationId;
    }

    public void setGenerationId(int generationId) {
        this.generationId = generationId;
    }

    public int getMovesTypeId() {
        return movesTypeId;
    }

    public void setMovesTypeId(int movesTypeId) {
        this.movesTypeId = movesTypeId;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getDamageClassId() {
        return damageClassId;
    }

    public void setDamageClassId(int damageClassId) {
        this.damageClassId = damageClassId;
    }

    public int getEffectId() {
        return effectId;
    }

    public void setEffectId(int effectId) {
        this.effectId = effectId;
    }

    public String getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(String effectChance) {
        this.effectChance = effectChance;
    }

    public Integer getContestTypeId() {
        return contestTypeId;
    }

    public void setContestTypeId(int contestTypeId) {
        this.contestTypeId = contestTypeId;
    }

    public Integer getContestEffectId() {
        return contestEffectId;
    }

    public void setContestEffectId(int contestEffectId) {
        this.contestEffectId = contestEffectId;
    }

    public Integer getSuperContestEffectId() {
        return superContestEffectId;
    }

    public void setSuperContestEffectId(int superContestEffectId) {
        this.superContestEffectId = superContestEffectId;
    }

}
