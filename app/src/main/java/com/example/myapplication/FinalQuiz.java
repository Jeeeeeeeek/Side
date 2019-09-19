package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinalQuiz extends AppCompatActivity {

    Button buttonQz1, buttonQz2, buttonQz3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_quiz);

        buttonQz1 = (Button) findViewById(R.id.buttonQz1);
        buttonQz2 = (Button) findViewById(R.id.buttonQz2);
        buttonQz3 = (Button) findViewById(R.id.buttonQz3);

        buttonQz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalQuiz.this, QuizActivity.class)
                        .putExtra("QuizDetails", "FinalQuiz")
                        .putExtra("QuizDetails2", "Quiz1");
                startActivity(intent);
                finish();
            }
        });

        buttonQz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalQuiz.this, QuizActivity.class)
                        .putExtra("QuizDetails", "FinalQuiz")
                        .putExtra("QuizDetails2", "Quiz2");
                startActivity(intent);
                finish();

            }
        });

        buttonQz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalQuiz.this, QuizActivity.class)
                        .putExtra("QuizDetails", "FinalQuiz")
                        .putExtra("QuizDetails2", "Quiz3");
                startActivity(intent);
                finish();

            }
        });

    }
}
