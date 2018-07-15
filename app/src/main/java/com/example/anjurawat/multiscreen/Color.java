package com.example.anjurawat.multiscreen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Color extends AppCompatActivity {
private  MediaPlayer   mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("Black", "काला",R.drawable.color_black,R.raw.black));
        words.add(new Word("Brown", "भूरा",R.drawable.color_brown,R.raw.brown));
        words.add(new Word("Green", "हरा",R.drawable.color_green,R.raw.green));
        words.add(new Word("Grey", "धूसर",R.drawable.color_gray,R.raw.grey));
        words.add(new Word("Dusty Yellow", "धूल भरी पीला",R.drawable.color_dusty_yellow,R.raw.dusty_yellow));
        words.add(new Word( "Red", "लाल",R.drawable.color_red,R.raw.red));
        words.add(new Word("White", "सफ़ेद",R.drawable.color_white,R.raw.white));
        words.add(new Word("Mustard Yellow ", "पीला",R.drawable.color_mustard_yellow,R.raw.yellow));

      // WordAddpter adapter1 = new WordAddpter(this, words);
        WordAddpter adapter1 = new WordAddpter(this, words, R.color.category_colors);

        ListView rootView = (ListView)findViewById(R.id.list);

        rootView.setAdapter(adapter1);
        rootView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                mMediaPlayer = MediaPlayer.create(Color.this, word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });

    }
}
