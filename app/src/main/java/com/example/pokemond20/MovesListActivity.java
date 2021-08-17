package com.example.pokemond20;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.pokemond20.queryData.MoveListTuple;
import com.example.pokemond20.roomData.PokemonMoves;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public class MovesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moves_list);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void testRoom(View view) {
        ListViewModel viewModel = new ListViewModel(getApplication());
        ListenableFuture<List<MoveListTuple>> bulbasaurMoves = viewModel.getMovesFromPkmn(1);
        try {
            // Prints out every move obtained
            Log.d("", "\n\n***** BULBASAUR'S MOVES *****\n");
            bulbasaurMoves.get().forEach((MoveListTuple theMove) ->
                    Log.d("\tMove: ",
                            theMove.identifier + ""));
            Log.d("", "\n*****END BULBASAUR'S MOVES*****\n\n");
        } catch (Exception e) {
            Log.d("ERROR", e.toString());
        }
    }
}