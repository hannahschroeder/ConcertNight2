package com.example.concertnight2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvStory;
    private ImageView ivMain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ivMain = findViewById(R.id.iv_main);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        tvStory = findViewById(R.id.tv_story);
        tvStory.setText(story);

        ivMain.setImageResource(R.drawable.image_concertnight_main2);
    }
}