package com.example.pokemond20.data;
import androidx.lifecycle.LiveData;
import androidx.room.*;

import java.util.List;
@Dao
public interface MovesDao {
    //TODO - Eventually add the "Theoretical Moves"
    @Query("SELECT * FROM moves WHERE id = (:id)")
    LiveData<List<Moves>> getMoves(int id);

    @Query("SELECT * FROM moves WHERE identifier = (:name)")
    LiveData<List<Moves>> getMoves(String name);

}
