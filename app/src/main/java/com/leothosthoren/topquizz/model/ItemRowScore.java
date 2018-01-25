package com.leothosthoren.topquizz.model;

import static com.leothosthoren.topquizz.controller.MainActivity.PREF_KEY_FIRSTNAME;
import static com.leothosthoren.topquizz.controller.MainActivity.PREF_KEY_SCORE;

/**
 * Created by Sofiane M. alias Leothos Thoren on 25/01/2018
 */
public class ItemRowScore {
    private int mIndex;
    private String mPseudo;
    private String mScore;

    public ItemRowScore(int index, String pseudo, String score) {
        mIndex = index;
        mPseudo = pseudo;
        mScore = score;
    }

    public int getIndex() {
        return mIndex;
    }

    public String getPseudo() {
        mPseudo = PREF_KEY_FIRSTNAME;
        return mPseudo;
    }

    public String getScore() {
        mScore = PREF_KEY_SCORE;
        return mScore;
    }
}
