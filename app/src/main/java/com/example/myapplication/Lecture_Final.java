package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lecture_Final extends AppCompatActivity {

    Button btnFinalBack, finalone, finaltwo,finalthree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture__final);

        btnFinalBack = (Button) findViewById(R.id.btnFinalBack);
        btnFinalBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLecture();
            }
        });

        finalone = (Button) findViewById(R.id.finalone);
        finalone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lecture_Final.this, FinalOne.class);
                startActivity(intent);
                finish();
            }
        });

        finaltwo = (Button) findViewById(R.id.finaltwo);
        finaltwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lecture_Final.this, FinalOne.class);
                startActivity(intent);
                finish();
            }
        });

        finalthree = (Button) findViewById(R.id.finalthree);
        finalthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lecture_Final.this, FinalOne.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void openLecture() {
        Intent intent = new Intent(this, Lecture.class);
        startActivity(intent);
        finish();
    }
    public void onBackPressed() {

    }
}
