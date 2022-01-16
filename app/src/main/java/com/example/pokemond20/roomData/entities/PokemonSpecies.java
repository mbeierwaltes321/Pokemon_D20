package com.example.pokemond20.roomData.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "pokemon_species")
public class PokemonSpecies {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int PokemonSpeciesId;

    @ColumnInfo(name = "identifier")
    private String identifier;

    
    @ColumnInfo(name = "generation_id")
    private int pkmnSpeciesGenerationId;

    @ColumnInfo(name = "evolves_from_species_id")
    private String evolvesFromSpeciesId;

    
    @ColumnInfo(name = "evolution_chain_id")
    private int evolutionChainId;

    
    @ColumnInfo(name = "color_id")
    private int colorId;

    
    @ColumnInfo(name = "shape_id")
    private int shapeId;

    @ColumnInfo(name = "habitat_id")
    private int pkmnSpeciesHabitatId;

    @ColumnInfo(name = "gender_rate")
    private int genderRate;

    
    @ColumnInfo(name = "capture_rate")
    private int CaptureRate;

    
    @ColumnInfo(name = "base_happiness")
    private int BaseHappiness;

    
    @ColumnInfo(name = "is_baby")
    private int isBaby;

    
    @ColumnInfo(name = "hatch_counter")
    private int hatchCounter;

    
    @ColumnInfo(name = "has_gender_differences")
    private int hasGenderDifferences;

    
    @ColumnInfo(name = "growth_rate_id")
    private int growthRateId;

    
    @ColumnInfo(name = "forms_switchable")
    private int formsSwitchable;

    @ColumnInfo(name = "is_legendary")
    private int isLegendary;

    @ColumnInfo(name = "is_mythical")
    private int isMythical;

    
    @ColumnInfo(name = "order")
    private int pkmnSpeciesOrder;

    
    @ColumnInfo(name = "conquest_order")
    private String ConquestOrder;


    public int getPokemonSpeciesId() {
        return PokemonSpeciesId;
    }

    public void setPokemonSpeciesId(int pokemonSpeciesId) {
        PokemonSpeciesId = pokemonSpeciesId;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getPkmnSpeciesGenerationId() {
        return pkmnSpeciesGenerationId;
    }

    public void setPkmnSpeciesGenerationId(int pkmnSpeciesGenerationId) {
        this.pkmnSpeciesGenerationId = pkmnSpeciesGenerationId;
    }

    public String getEvolvesFromSpeciesId() {
        return evolvesFromSpeciesId;
    }

    public void setEvolvesFromSpeciesId(String evolvesFromSpeciesId) {
        this.evolvesFromSpeciesId = evolvesFromSpeciesId;
    }

    public int getEvolutionChainId() {
        return evolutionChainId;
    }

    public void setEvolutionChainId(int evolutionChainId) {
        this.evolutionChainId = evolutionChainId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getShapeId() {
        return shapeId;
    }

    public void setShapeId(int shapeId) {
        this.shapeId = shapeId;
    }

    public int getPkmnSpeciesHabitatId() {
        return pkmnSpeciesHabitatId;
    }

    public void setPkmnSpeciesHabitatId(int pkmnSpeciesHabitatId) {
        this.pkmnSpeciesHabitatId = pkmnSpeciesHabitatId;
    }

    public int getGenderRate() {
        return genderRate;
    }

    public void setGenderRate(int genderRate) {
        this.genderRate = genderRate;
    }

    public int getCaptureRate() {
        return CaptureRate;
    }

    public void setCaptureRate(int captureRate) {
        CaptureRate = captureRate;
    }

    public int getBaseHappiness() {
        return BaseHappiness;
    }

    public void setBaseHappiness(int baseHappiness) {
        BaseHappiness = baseHappiness;
    }

    public int getIsBaby() {
        return isBaby;
    }

    public void setIsBaby(int isBaby) {
        this.isBaby = isBaby;
    }

    public int getHatchCounter() {
        return hatchCounter;
    }

    public void setHatchCounter(int hatchCounter) {
        this.hatchCounter = hatchCounter;
    }

    public int getHasGenderDifferences() {
        return hasGenderDifferences;
    }

    public void setHasGenderDifferences(int hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    public int getGrowthRateId() {
        return growthRateId;
    }

    public void setGrowthRateId(int growthRateId) {
        this.growthRateId = growthRateId;
    }

    public int getFormsSwitchable() {
        return formsSwitchable;
    }

    public void setFormsSwitchable(int formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }

    public int getIsLegendary() {
        return isLegendary;
    }

    public void setIsLegendary(int isLegendary) {
        this.isLegendary = isLegendary;
    }

    public int getIsMythical() {
        return isMythical;
    }

    public void setIsMythical(int isMythical) {
        this.isMythical = isMythical;
    }

    public int getPkmnSpeciesOrder() {
        return pkmnSpeciesOrder;
    }

    public void setPkmnSpeciesOrder(int pkmnSpeciesOrder) {
        this.pkmnSpeciesOrder = pkmnSpeciesOrder;
    }

    public String getConquestOrder() {
        return ConquestOrder;
    }

    public void setConquestOrder(String conquestOrder) {
        ConquestOrder = conquestOrder;
    }
}
