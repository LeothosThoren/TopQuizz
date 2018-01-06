package com.leothosthoren.topquizz.controller;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.leothosthoren.topquizz.R;

import static com.leothosthoren.topquizz.controller.MainActivity.GAME_ACTIVITY_ID;
import static com.leothosthoren.topquizz.controller.MainActivity.PREF_KEY_SCORE;

public class ScoreActivity extends AppCompatActivity {

    private TextView mFstScore;
    private String mName;
    private int mScore;
    private Button mBtnName;
    private Button mBtnScore;
    private SharedPreferences mSharedPreferences;
    private String scoreInput;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mSharedPreferences = getPreferences(MODE_PRIVATE);

        mFstScore = findViewById(R.id.activity_score_result1_txt);
        mBtnName = findViewById(R.id.activity_score_sortName_btn);
        mBtnScore = findViewById(R.id.activity_score_sortScore_btn);

        //Find how to pick and store score and name
//        mName = mSharedPreferences.getString(PREF_KEY_FIRSTNAME, null);
        mScore = mSharedPreferences.getInt(PREF_KEY_SCORE, 0);

        scoreInput = "1st - " + mName + " " + mScore + " points";
        mFstScore.setText(scoreInput);
    }

    //Methods
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (GAME_ACTIVITY_ID == requestCode && RESULT_OK == resultCode) {
            //Fetch the score from the Intent
            int score = data.getIntExtra(GameActivity.BUNDLE_EXTRA_SCORE, 0);
            String name = data.getStringExtra(MainActivity.PREF_KEY_FIRSTNAME);
            //Stock the score in shared preferences
            mSharedPreferences.edit().putInt(PREF_KEY_SCORE, score).apply();
//            mSharedPreferences.edit().putString(PREF_KEY_FIRSTNAME, name).apply();
        }
    }
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