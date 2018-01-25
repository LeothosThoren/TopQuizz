package com.leothosthoren.topquizz.controller;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.leothosthoren.topquizz.R;
import com.leothosthoren.topquizz.model.ItemRowScore;
import com.leothosthoren.topquizz.model.User;
import com.leothosthoren.topquizz.view.ScoreAdapter;

import java.util.ArrayList;
import java.util.List;

import static com.leothosthoren.topquizz.controller.MainActivity.PREF_KEY_FIRSTNAME;
import static com.leothosthoren.topquizz.controller.MainActivity.PREF_KEY_SCORE;

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

        List<ItemRowScore> itemRowScoreList = new ArrayList<ItemRowScore>();
        ScoreAdapter adapter = new ScoreAdapter(this, itemRowScoreList);
        mListView.setAdapter(adapter);

        itemRowScoreList.add(new ItemRowScore(1, "pseudo", "score"));
    }

    //Methods
/*TODO:
  ajouter les deux boutons de tri programmaticallement
  ajouter le tri ascendant
* récupérer le score du joueur et son nom
* Sauvegarder les infos à chaque fin de partie de la Game Activity
* Retourner à la page d'accueil et non pas à la game Activity lorsque sur la page des scores
* Penser à bien charger les data dans la page Score à son ouverture
* Limiter le nombre de ligne à 5 maximum
* Remplacer la ligne la moins bonne
* Ajouter une date de score
* Remanier le layout des items
* */


}
