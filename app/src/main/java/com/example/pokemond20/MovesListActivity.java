package com.example.pokemond20;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.pokemond20.queryData.MoveListTuple;
import com.example.pokemond20.recyclerView.MovesAdapter;
import com.example.pokemond20.roomData.Moves;
import com.example.pokemond20.roomData.PokemonMoves;
import com.google.common.util.concurrent.ListenableFuture;

import org.w3c.dom.Text;

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
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvPokemonMovesList);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        try {

            String inputtedPokemon = ((EditText) findViewById(R.id.etxtPokemonInput))
                    .getText().toString().toLowerCase();

            ListenableFuture<List<MoveListTuple>> movesResult
                    = viewModel.getMovesFromPkmn(inputtedPokemon);

//            Log.d("", "\n\n***** BULBASAUR'S MOVES *****\n");
//            movesResult.get().forEach((MoveListTuple theMove) ->
//                    Log.d("\tMove: ", theMove.getMoveId() + " " +
//                            theMove.getMoveIdentifier() + " " +
//                            theMove.getPokemonId() + " " +
//                            theMove.getPokemonIdentifier() + "\n"));
//            Log.d("", "\n*****END BULBASAUR'S MOVES*****\n\n");


            MovesAdapter adapter = new MovesAdapter(movesResult.get());
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(manager);
        } catch (Exception e) {
            Log.d("ERROR", e.toString());
        }
    }
}