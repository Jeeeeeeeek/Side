package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MidtermTwo extends AppCompatActivity {

    TextView textView9;
    Button tryandcatchButton, userdefineButton, assertionsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_two);

        textView9 = (TextView)findViewById(R.id.textView9);
        textView9.setText(Html.fromHtml(getString(R.string.midtermtwo)));

        tryandcatchButton = (Button)findViewById(R.id.tryandcatchButton);
        tryandcatchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermTwo.this, MidtermTwo_TryAndCatch.class);
                startActivity(intent);
                finish();
            }
        });

        userdefineButton = (Button)findViewById(R.id.userdefineButton);
        userdefineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermTwo.this, MidtermTwo_UserDefined.class);
                startActivity(intent);
                finish();
            }
        });

        assertionsButton = (Button)findViewById(R.id.assertionsButton);
        assertionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermTwo.this, MidtermTwo_Assertion.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
