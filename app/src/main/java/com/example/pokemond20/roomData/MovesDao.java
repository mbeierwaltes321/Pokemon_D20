package com.example.pokemond20.roomData;
import androidx.room.Dao;
import androidx.room.Query;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

@Dao
public interface MovesDao {
    //TODO - Eventually add the "Theoretical Moves"
    @Query("SELECT * FROM moves WHERE id = (:id)")
    ListenableFuture<List<Moves>> getMove(int id);

    @Query("SELECT * FROM moves WHERE identifier = (:name)")
    ListenableFuture<List<Moves>> getMove(String name);

    @Query("SELECT * FROM moves;")
    ListenableFuture<List<Moves>> getAllMoves();

}
