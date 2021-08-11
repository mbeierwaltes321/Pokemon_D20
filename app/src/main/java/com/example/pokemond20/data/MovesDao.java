package com.example.pokemond20.data;
import androidx.room.Dao;
import androidx.room.Query;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

@Dao
public interface MovesDao {
    //TODO - Eventually add the "Theoretical Moves"
    @Query("SELECT * FROM moves WHERE id = (:id)")
    ListenableFuture<List<Moves>> getMoves(int id);

    @Query("SELECT * FROM moves WHERE identifier = (:name)")
    ListenableFuture<List<Moves>> getMoves(String name);

    @Query("SELECT * FROM moves;")
    ListenableFuture<List<Moves>> getAllMoves();

}
