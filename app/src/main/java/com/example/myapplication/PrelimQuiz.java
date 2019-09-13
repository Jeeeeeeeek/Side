package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrelimQuiz extends AppCompatActivity {

    Button buttonQz1, buttonQz2, buttonQz3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prelim_quiz);

        buttonQz1 = (Button) findViewById(R.id.buttonQz1);
        buttonQz2 = (Button) findViewById(R.id.buttonQz2);
        buttonQz3 = (Button) findViewById(R.id.buttonQz3);

        buttonQz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrelimQuiz.this, QuizActivity.class);
                startActivity(intent);
                finish();
            }
        });

        buttonQz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonQz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
