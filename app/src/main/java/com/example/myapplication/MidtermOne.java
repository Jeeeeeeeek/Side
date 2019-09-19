package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MidtermOne extends AppCompatActivity {

    TextView midtermOneText;
    Button midtermoneback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_one);


        midtermoneback = (Button) findViewById(R.id.midtermoneback);

        midtermoneback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermOne.this, Lecture_Midterm.class);
                startActivity(intent);
            }
        });

    }
}
