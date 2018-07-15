package com.example.anjurawat.multiscreen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
   // String words [] = new String [] {"one","two","three","four","five","six","seven","eight","nine","ten"};
   private  MediaPlayer  mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
      final   ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("one", "एक",R.drawable.number_one,R.raw.one));
        words.add(new Word("Two", "दो",R.drawable.number_two,R.raw.two));
        words.add(new Word("Three", "तीन",R.drawable.number_three,R.raw.three));
        words.add(new Word("Four", "चार",R.drawable.number_four,R.raw.four));
        words.add(new Word("Five", "पांच",R.drawable.number_five,R.raw.five));
        words.add(new Word("Six", "छह",R.drawable.number_six,R.raw.six));
        words.add(new Word("Seven", "सात",R.drawable.number_seven,R.raw.seven));
        words.add(new Word("Eight", "आठ",R.drawable.number_eight,R.raw.eight));
        words.add(new Word("Nine", "नौ",R.drawable.number_nine,R.raw.nine));
        words.add(new Word("Ten", "दस",R.drawable.number_ten,R.raw.ten));

       // WordAddpter adapter1 = new WordAddpter(this, words);
        WordAddpter adapter1 = new WordAddpter(this, words, R.color.category_numbers);
        ListView rootView = (ListView)findViewById(R.id.list);

        rootView.setAdapter(adapter1);

        rootView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                mMediaPlayer = MediaPlayer.create(Numbers.this, word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });


    }
}
