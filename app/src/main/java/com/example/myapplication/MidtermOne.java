package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MidtermOne extends AppCompatActivity {

    TextView midtermOneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_one);

        midtermOneText = (TextView) findViewById(R.id.midtermOneText);
        midtermOneText.setText(Html.fromHtml(getString(R.string.midtermone)));
    }
}
