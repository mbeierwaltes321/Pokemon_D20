package com.example.pokemond20.data;
import androidx.room.*;

@Dao
public interface MovesDao {
    //TODO - Eventually add the "Theoretical Moves"
    @Query("SELECT * FROM moves WHERE id = (:id)")
    Moves getMoves(int id);

    @Query("SELECT * FROM moves WHERE identifier = (:name)")
    Moves getMoves(String name);
}
