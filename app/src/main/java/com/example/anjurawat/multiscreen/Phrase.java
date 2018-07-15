package com.example.anjurawat.multiscreen;

import android.media.MediaPlayer;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrase extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("where are you going?", "तुम कहाँ जा रहे हो",R.raw.where_r_u_going));
        words.add(new Word( "what is your name?", "तुम्हारा नाम क्या हे?",R.raw.what_is_ur_name));
        words.add(new Word("My name is....", "मेरा नाम है....",R.raw.my_name_is));
        words.add(new Word("How are you feeling?", "आप कैसा महसूस कर रहे हैं?",R.raw.how_r_u_feeling));
        words.add(new Word("I’m feeling good.", "मैं अच्छा महसूस कर रहा हूँ।",R.raw.i_m_feeling_good));
        words.add(new Word("Are you coming?.", "क्या तुम आ रहे हो?",R.raw.r_u_coming));
        words.add(new Word("Yes, I’m coming.", "हाँ, आ रहा हूं..",R.raw.coming));
        words.add(new Word("No, I’m not coming..", "नहीं, मैं नहीं आ रहा हूँ ..",R.raw.i_m_not_coming));
        words.add(new Word( "Let’s go.", "चलिए चलते हैं।",R.raw.lets_go));
        words.add(new Word("Come here.", "यहाँ आओ",R.raw.come_here));
        words.add(new Word("what are u doing", "आप क्या कर रहे हैं",R.raw.what_u_doing));

       // WordAddpter adapter1 = new WordAddpter(this, words);

        WordAddpter adapter1 = new WordAddpter(this, words, R.color.category_phrases);
        ListView rootView = (ListView)findViewById(R.id.list);

        rootView.setAdapter(adapter1);

      rootView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                mMediaPlayer = MediaPlayer.create(Phrase.this, word.getAudioResourceId());

                mMediaPlayer.start();
            }
        });


    }
}
