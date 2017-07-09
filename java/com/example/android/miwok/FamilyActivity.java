package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> wordsf = new ArrayList<>();

        wordsf.add(new Word("father", "әpә", R.drawable.family_father));
        wordsf.add(new Word("mother", "әṭa", R.drawable.family_mother));
        wordsf.add(new Word("son", "angsi", R.drawable.family_son));
        wordsf.add(new Word("daughter", "tune", R.drawable.family_daughter));
        wordsf.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        wordsf.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        wordsf.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        wordsf.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        wordsf.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.activity_numbers);

//        for(int i = 0; i < words.size(); i++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }
//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter adapterf = new WordAdapter(this, wordsf);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapterf);

    }
}
