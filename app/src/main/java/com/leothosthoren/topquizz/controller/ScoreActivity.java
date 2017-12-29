package com.leothosthoren.topquizz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.leothosthoren.topquizz.R;

public class ScoreActivity extends AppCompatActivity {

    private TextView mFstScore;
    private TextView mScdScore;
    private TextView mThdScore;
    private TextView mFothScore;
    private TextView mFthScore;
    private Button mBtnName;
    private  Button mBtnScore;


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



    }
}
