package com.example.pokemond20.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pokemond20.R;
import com.example.pokemond20.roomData.daos.MovesDao;

import java.util.List;

public class MovesListAdapter extends RecyclerView.Adapter<MovesListAdapter.dataListViewHolder> {

    private List<MovesDao.MoveListTuple> moveList;

    // View Holder for the RecyclerView
    public static class dataListViewHolder extends  RecyclerView.ViewHolder {
        private final TextView listItemTextView;

        public dataListViewHolder(View view) {
            super(view);
            listItemTextView = (TextView) view.findViewById(R.id.listItemTextView);
        }

        public TextView getListItemTextView() { return listItemTextView; }
    }

    // Default constructor
    public MovesListAdapter(List<MovesDao.MoveListTuple> moveList) {
        this.moveList = moveList;
    }

    // Layout manager calls this to create the views
    @Override
    public dataListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new dataListViewHolder(view);
    }

    // Layout manager calls this to replace the contents of a view
    @Override
    public void onBindViewHolder(dataListViewHolder viewHolder, final int position) {

        // Get element from data and replace the contents of the view with
        // the Pokemon name
        viewHolder.getListItemTextView()
                .setText((position + 1) + ". " + moveList.get(position).getMoveName());
    }

    @Override
    public int getItemCount() { return moveList.size(); }
}