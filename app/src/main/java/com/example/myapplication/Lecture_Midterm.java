package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lecture_Midterm extends AppCompatActivity {

    Button btnMidtermBack,midtermone,midtermtwo,midtermthree,midtermfour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture__midterm);

        btnMidtermBack = (Button) findViewById(R.id.btnMidtermBack);
        btnMidtermBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLecture();
            }
        });

        midtermone = (Button) findViewById(R.id.midtermone);
        midtermone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lecture_Midterm.this, MidtermOne.class);
                startActivity(intent);
                finish();
            }
        });

        midtermtwo = (Button) findViewById(R.id.midtermtwo);
        midtermtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lecture_Midterm.this, MidtermTwo.class);
                startActivity(intent);
                finish();
            }
        });

        midtermthree = (Button) findViewById(R.id.midtermthree);
        midtermthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lecture_Midterm.this, MidtermThree.class);
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

