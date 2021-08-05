package com.example.pokemond20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.*;
import com.example.pokemond20.data.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.pokemond20.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* TODO: Add functionality to buttons that lead to other activities
    1. Activity - Select Pokemon, show moves
    2. Activity - Select move, show Pokemon
    */

    // Called when the user taps the "Moves" button
    public void toMoves(View view) {
        Intent intent = new Intent(this, MovesListActivity.class);
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    // TODO: Arrange Project to work with recommended architecture
    // TODO: Utilize Room database with project.

}