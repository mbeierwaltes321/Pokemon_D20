package com.example.pokemond20;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.pokemond20.data.Moves;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public class MovesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moves_list);
    }

    //TODO - determine database error
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void testRoom(View view) {
        ListViewModel viewModel = new ListViewModel(getApplication());
        ListenableFuture<List<Moves>> theMoves = viewModel.getAllMoves();
        try {
            // Prints out every move obtained
            theMoves.get().forEach((Moves theMove) -> Log.d("\tMove", theMove.getIdentifier()));
        } catch (Exception e) {
            Log.d("ERROR", e.toString());
        }
    }
}