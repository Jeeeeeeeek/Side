package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizHome extends AppCompatActivity {

    Button prelimQuiz, midtermQuiz, finalQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_home);

        prelimQuiz = (Button) findViewById(R.id.prelimQuiz);
        midtermQuiz = (Button) findViewById(R.id.midtermQuiz);
        finalQuiz = (Button) findViewById(R.id.finalQuiz);

        prelimQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizHome.this, PrelimQuiz.class);
                startActivity(intent);
            }
        });

        midtermQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizHome.this, MidtermQuiz.class);
                startActivity(intent);
            }
        });

        finalQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizHome.this, FinalQuiz.class);
                startActivity(intent);
            }
        });
    }
]
