package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MidtermTwo_TryAndCatch extends AppCompatActivity {

    TextView textView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_two__try_and_catch);

        textView10 = (TextView)findViewById(R.id.textView10);
        textView10.setText(Html.fromHtml(getString(R.string.midtermtwo)));

    }
}
