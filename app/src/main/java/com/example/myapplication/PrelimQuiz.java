package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class PrelimQuiz extends AppCompatActivity {

    Button buttonQz1, buttonQz2, buttonQz3;
    DatabaseReference reference;
    Button prelimquizback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prelim_quiz);

        prelimquizback = (Button) findViewById(R.id.prelimquizback);

        prelimquizback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrelimQuiz.this, QuizHome.class);
                startActivity(intent);
            }
        });

        buttonQz1 = (Button) findViewById(R.id.buttonQz1);
        buttonQz2 = (Button) findViewById(R.id.buttonQz2);
        buttonQz3 = (Button) findViewById(R.id.buttonQz3);

        buttonQz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrelimQuiz.this, QuizActivity.class)
                        .putExtra("QuizDetails", "PrelimQuiz")
                        .putExtra("QuizDetails2", "Quiz1");
                startActivity(intent);
                finish();
            }
        });

        buttonQz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrelimQuiz.this, QuizActivity.class)
                        .putExtra("QuizDetails", "PrelimQuiz")
                        .putExtra("QuizDetails2", "Quiz2");
                startActivity(intent);
                finish();

            }
        });

        buttonQz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrelimQuiz.this, QuizActivity.class)
                        .putExtra("QuizDetails", "PrelimQuiz")
                        .putExtra("QuizDetails2", "Quiz3");
                startActivity(intent);
                finish();

            }
        });
    }
}
