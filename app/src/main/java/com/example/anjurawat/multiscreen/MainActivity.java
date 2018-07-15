package com.example.anjurawat.multiscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
 TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.numbers);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Numbers.class);
                startActivity(i);
            }
        });

       t2=(TextView)findViewById(R.id.family);
       t2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent j = new Intent(MainActivity.this, Fmembers.class);
               startActivity(j);
           }
       });

       t3=(TextView)findViewById(R.id.color);
       t3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent k = new Intent(MainActivity.this, Color.class);
               startActivity(k);
           }
       });

       t4=(TextView)findViewById(R.id.pharses);
       t4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent l = new Intent(MainActivity.this, Phrase.class);
               startActivity(l);

           }
       });

    }


  /*  public void Number1(View view) {

        Intent i = new Intent(MainActivity.this, Numbers.class);
        startActivity(i);
    }

    public void family(View view) {
        Intent j = new Intent(MainActivity.this, Fmembers.class);
        startActivity(j);
    }

    public void color(View view) {
        Intent k = new Intent(MainActivity.this, Color.class);
        startActivity(k);
    }

    public void phrase(View view) {
        Intent l = new Intent(MainActivity.this, Phrase.class);
        startActivity(l);
    }*/

}
