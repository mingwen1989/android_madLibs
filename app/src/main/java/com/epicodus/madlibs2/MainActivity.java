package com.epicodus.madlibs2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mSubmitWordsButton;
    private EditText mMadLibs;
    private EditText mMadLibs2;
    private EditText mMadLibs3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMadLibs = (EditText) findViewById(R.id.madLibs);
        mMadLibs2 = (EditText) findViewById(R.id.madLibs2);
        mMadLibs3 = (EditText) findViewById(R.id.madLibs3);
        mSubmitWordsButton = (Button) findViewById(R.id.submitWordsButton);
        mSubmitWordsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word1 = mMadLibs.getText().toString();
                String word2 = mMadLibs2.getText().toString();
                String word3 = mMadLibs3.getText().toString();

                Log.d(TAG, word1);
                Log.d(TAG, word2);
                Log.d(TAG, word3);

                Intent intent = new Intent(MainActivity.this, MadLibs.class);
                intent.putExtra("word1", word1);
                intent.putExtra("word2", word2);
                intent.putExtra("word3", word3);
                startActivity(intent);
            }
        });
    }
}
