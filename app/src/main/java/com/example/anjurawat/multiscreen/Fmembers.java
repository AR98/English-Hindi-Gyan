package com.example.anjurawat.multiscreen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Fmembers extends AppCompatActivity {
 private MediaPlayer  mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
      final  ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("Father", "पिता",R.drawable.family_father,R.raw.father));
        words.add(new Word("Mother", " माता",R.drawable.family_mother,R.raw.mother));
        words.add(new Word("Older Brother", "बड़ा भाई",R.drawable.family_older_brother,R.raw.elder_brother));
        words.add(new Word("Older Sister ", "बड़ी बहन",R.drawable.family_older_sister,R.raw.elder_sister));
        words.add(new Word("Daughter", " बेटी",R.drawable.family_daughter,R.raw.daugther));
        words.add(new Word("Son", "बेटा",R.drawable.family_son,R.raw.son));
        words.add(new Word("Younger Sister", "छोटी बहन",R.drawable.family_younger_sister,R.raw.younger_sister));
        words.add(new Word("Younger brother", "छोटा भाई",R.drawable.family_younger_brother,R.raw.younger_brother));
        words.add(new Word("Grandmother", "दादी, नानी",R.drawable.family_grandmother,R.raw.grandmother));
        words.add(new Word(" Grandfather", "दादा, नाना",R.drawable.family_grandfather,R.raw.grandfather));

      //  WordAddpter adapter1 = new WordAddpter(this, words);
        WordAddpter adapter1 = new WordAddpter(this, words, R.color.category_family);

        ListView rootView = (ListView)findViewById(R.id.list);

        rootView.setAdapter(adapter1);
        rootView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                mMediaPlayer = MediaPlayer.create(Fmembers.this, word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });

    }
}
