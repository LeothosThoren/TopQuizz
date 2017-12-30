package com.leothosthoren.topquizz.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.leothosthoren.topquizz.R;
import com.leothosthoren.topquizz.model.User;

public class ScoreActivity extends AppCompatActivity {

    private TextView mFstScore;
    private TextView mScdScore;
    private TextView mThdScore;
    private TextView mFothScore;
    private TextView mFthScore;
    private Button mBtnName;
    private Button mBtnScore;
    private User mNameUser;
    private int mScore;

    public static final String PREF_KEY_SCORE = "PKS";
    public static final String PREF_KEY_FIRSTNAME = "PKF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mFstScore = findViewById(R.id.activity_score_result1_txt);
        mScdScore = findViewById(R.id.activity_score_result2_txt);
        mThdScore = findViewById(R.id.activity_score_result3_txt);
        mFothScore = findViewById(R.id.activity_score_result4_txt);
        mFthScore = findViewById(R.id.activity_score_result5_txt);

        mBtnName = findViewById(R.id.activity_score_sortName_btn);
        mBtnScore = findViewById(R.id.activity_score_sortScore_btn);


        //Find how to pick and store score and name
        Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
        String str = intent.getStringExtra(PREF_KEY_FIRSTNAME);

        mFstScore.setText("Nom du joueur "+str);

    }

    //Methods

}
// Cut the problem :
//First we need to access the score and the name information
//
//Two we need to storage the name and the score of the current player anytime he plays
//The score must be stored even if the application is shutdown
//We must limit the number of scores to five lines
//Every time you outbounded that number of five replace the less score among the list or do not store the score
//if there are less  than 5 scores stored inside the game then make sure that the line without data dont't appear on the screen
//We must sort the list of score