package com.leothosthoren.topquizz.model;

/**
 * Created by Sofiane M. alias Leothos Thoren on 25/01/2018
 * Simple class with constructor and class. This allow to give a new type to our ArrayList/List object
 * ArrayList<ItemRowScore>
 */
public class ItemRowScore {
    private String mPseudo;
    private String mScore;

    public ItemRowScore(String pseudo, String score) {
        mPseudo = pseudo;
        mScore = score;
    }

    public String getPseudo() {
        return mPseudo;
    }

    public String getScore() {
        return mScore;
    }

    @Override
    public String toString() {
        return
                "Nom ='" + mPseudo + '\'' +
                        ", Score ='" + mScore + '\'' +
                        '}';
    }
}
