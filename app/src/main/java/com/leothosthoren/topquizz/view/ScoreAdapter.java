package com.leothosthoren.topquizz.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.leothosthoren.topquizz.R;
import com.leothosthoren.topquizz.model.ItemRowScore;

import java.util.List;
/**
 *
 * This class handle the view of the score activity thanks a list view
 * To perform a list view it's necessary to create an Adapter class, an holder class and class which contain the data and methods
 * useful
 * */
public class ScoreAdapter extends ArrayAdapter<ItemRowScore> {

    //scoreList is the model list to show
    public ScoreAdapter(Context context, List<ItemRowScore> scoreList) {
        super(context, 0, scoreList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_score, parent, false);
//            //Here we handle the height of every item in the score activity, as we have 5 item we subdivide equally
//            convertView.getLayoutParams().height = parent.getHeight() ;
        }

        //Her we define the real adapter of the view
        ScoreViewHolder holder = (ScoreViewHolder) convertView.getTag();
        if (holder == null) {
            holder = new ScoreViewHolder();
            holder.pseudo = (TextView) convertView.findViewById(R.id.row_pseudo);
            holder.score = (TextView) convertView.findViewById(R.id.row_score);
            convertView.setTag(holder);
        }

        ItemRowScore currentItem = getItem(position);

        //Here we fulfill the view
        assert currentItem != null;
        holder.pseudo.setText(currentItem.getPseudo());
        holder.score.setText(currentItem.getScore());

        return convertView;
    }

    //Create a class view holder in order to recycle the view for better performance
    private class ScoreViewHolder {
        public TextView pseudo;
        public TextView score;
    }
}
