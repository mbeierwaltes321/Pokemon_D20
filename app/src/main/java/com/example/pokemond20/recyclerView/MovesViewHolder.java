package com.example.pokemond20.recyclerView;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.pokemond20.R;

public class MovesViewHolder extends RecyclerView.ViewHolder {
    private final TextView moveTextView;

    public MovesViewHolder(View view) {
        super(view);
        moveTextView = (TextView) view.findViewById(R.id.moveTextView);
    }

    public TextView getMoveTextView() {
        return moveTextView;
    }
}
