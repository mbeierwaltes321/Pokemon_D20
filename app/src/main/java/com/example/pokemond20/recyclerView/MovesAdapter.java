//package com.example.pokemond20.recyclerView;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import androidx.recyclerview.widget.RecyclerView;
//import com.example.pokemond20.R;
//import com.example.pokemond20.queryData.MoveListTuple;
//import java.util.List;
//
//public class MovesAdapter extends RecyclerView.Adapter<MovesViewHolder> {
//    private List<MoveListTuple> moveDataSet;
//
//    public MovesAdapter(List<MoveListTuple> dataSet) {
//        moveDataSet = dataSet;
//    }
//
//    @Override
//    public MovesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
//        // Create view
//        View view = LayoutInflater.from(viewGroup.getContext())
//                .inflate(R.layout.move_row_text, viewGroup, false);
//        return new MovesViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(MovesViewHolder viewHolder, final int position ) {
//
//        // Get element from dataset at the position and replace the contents
//        // of the view with that element
//        viewHolder.getMoveTextView()
//                .setText("\u2022 " + moveDataSet.get(position).getMoveIdentifier());
//    }
//
//    @Override
//    public int getItemCount() {
//        return moveDataSet.size();
//    }
//
//}
