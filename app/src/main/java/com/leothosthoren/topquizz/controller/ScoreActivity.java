package com.leothosthoren.topquizz.controller;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.leothosthoren.topquizz.R;
import com.leothosthoren.topquizz.model.ItemRowScore;
import com.leothosthoren.topquizz.model.ScoreData;
import com.leothosthoren.topquizz.model.User;
import com.leothosthoren.topquizz.view.ScoreAdapter;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static com.leothosthoren.topquizz.model.ScoreData.mItemRowScores;

public class ScoreActivity extends AppCompatActivity {

    public User mUser;
    private TextView mFstScore;
    private String mName;
    private int mScore;
    private ImageButton mBtnName;
    private ImageButton mBtnScore;
    private SharedPreferences mPreferences;
    private String scoreInput;
    private ListView mListView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mListView = findViewById(R.id.list_view);
        mBtnName = findViewById(R.id.activity_score_sortName_btn);
        mBtnScore = findViewById(R.id.activity_score_sortScore_btn);

        ScoreData.loadData(this);
        final ScoreAdapter adapter = new ScoreAdapter(this, mItemRowScores);
        mListView.setAdapter(adapter);


        mBtnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sort by name
                Collections.sort(mItemRowScores, ComparatorNom);
                adapter.notifyDataSetChanged();
            }
        });

        mBtnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sort by score
                Collections.sort(mItemRowScores, ComparatorScore);
                adapter.notifyDataSetChanged();
            }
        });
    }

    //Methods
    public static Comparator<ItemRowScore> ComparatorNom = new Comparator<ItemRowScore>() {

        @Override
        public int compare(ItemRowScore e1, ItemRowScore e2) {
            return e1.getPseudo().compareTo(e2.getPseudo());
        }
    };

    public static Comparator<ItemRowScore> ComparatorScore = new Comparator<ItemRowScore>() {

        @Override
        public int compare(ItemRowScore e1, ItemRowScore e2) {
            return e1.getScore().compareTo(e2.getScore());
        }
    };


/*TODO:
  ajouter le tri ascendant
* Remplacer la ligne la moins bonne
* Ajouter une date de score
* */


}
