package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> wordsc = new ArrayList<>();

        wordsc.add(new Word("red", "wetetti", R.drawable.color_red));
        wordsc.add(new Word("green", "chokokki", R.drawable.color_green));
        wordsc.add(new Word("beown", "takaakki", R.drawable.color_brown));
        wordsc.add(new Word("grey", "tapappi", R.drawable.color_gray));
        wordsc.add(new Word("black", "kululli", R.drawable.color_black));
        wordsc.add(new Word("white", "kelelli", R.drawable.color_white));
        wordsc.add(new Word("dusty yellow", "topiisa", R.drawable.color_dusty_yellow));
        wordsc.add(new Word("mustard yellow", "chiwiita", R.drawable.color_mustard_yellow));

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.activity_numbers);

//        for(int i = 0; i < words.size(); i++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }
//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter adapterc = new WordAdapter(this, wordsc);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapterc);
    }
}
