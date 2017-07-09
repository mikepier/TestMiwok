package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> wordsp = new ArrayList<>();

        wordsp.add(new Word("Where are you going?", "minto wuksus"));
        wordsp.add(new Word("What is your name?", "tinnә oyaase'nә"));
        wordsp.add(new Word("My name is...", "oyaaset..."));
        wordsp.add(new Word("How are you feeling?", "michәksәs?"));
        wordsp.add(new Word("I’m feeling good.", "kuchi achit"));
        wordsp.add(new Word("Are you coming?", "әәnәs'aa?"));
        wordsp.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        wordsp.add(new Word("I’m coming.", "әәnәm"));
        wordsp.add(new Word("Let’s go.", "yoowutis"));
        wordsp.add(new Word("Come here.", "әnni'nem"));

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.activity_numbers);

//        for(int i = 0; i < words.size(); i++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }
//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter adapterp = new WordAdapter(this, wordsp);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapterp);
    }
}
