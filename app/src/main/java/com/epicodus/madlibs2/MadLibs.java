package com.epicodus.madlibs2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibs extends AppCompatActivity {
    private TextView mMadLibsSentence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);
        mMadLibsSentence = (TextView) findViewById(R.id.madLibsSentence);
        Intent intent = getIntent();
        String word1 = intent.getStringExtra("word1");
        String word2 = intent.getStringExtra("word2");
        String word3 = intent.getStringExtra("word3");
        mMadLibsSentence.setText("A " + word1 + " " + word2 + " near a " + word3 + " poodle.");
    }
}
