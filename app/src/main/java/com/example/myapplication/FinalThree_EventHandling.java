package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FinalThree_EventHandling extends AppCompatActivity {


    TextView textViewFinalThree;
    Button finalthreeCback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_three__event_handling);


        finalthreeCback = (Button) findViewById(R.id.finalthreeCback);

        finalthreeCback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalThree_EventHandling.this, Lecture_Final.class);
                startActivity(intent);
            }
        });


        ImageView iv = (ImageView)findViewById(R.id.imageView14);
        iv.setImageResource(R.drawable.finalthreec1);

        ImageView iv1 = (ImageView)findViewById(R.id.imageView15);
        iv1.setImageResource(R.drawable.finalthreec2);

        textViewFinalThree = (TextView)findViewById(R.id.textViewFinalThree);
        textViewFinalThree.setText(Html.fromHtml(getString(R.string.FinalThreeC)));

        textViewFinalThree = (TextView)findViewById(R.id.textView35);
        textViewFinalThree.setText(Html.fromHtml(getString(R.string.FinalThreeC1)));

    }
}
