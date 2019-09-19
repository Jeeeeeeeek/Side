package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Lecture_Final extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button btnFinalBack, finalone, finaltwo,finalthree;
    Spinner spinnerfinalone;
    Spinner spinnerfinaltwo;
    Spinner spinnerfinalthree;

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

        spinnerfinalone = (Spinner) findViewById(R.id.spinnerfinalone);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.FinalOneLessons, R.layout.spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerfinalone.setAdapter(adapter4);
        spinnerfinalone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long l) {
                finalone.setText(parent.getItemAtPosition(pos).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        finalone = (Button) findViewById(R.id.finalone);
        finalone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalone.getText().equals("Basic Input / Output")) {
                    Intent intent = new Intent(Lecture_Final.this, FinalOne.class);
                    startActivity(intent);
                } else if (finalone.getText().equals("File Input/Output")) {
                    Intent intent = new Intent(Lecture_Final.this, FinalOne_FileInputOutput.class);
                    startActivity(intent);
                } else if (finalone.getText().equals("File Input/Output Stream")) {
                    Intent intent = new Intent(Lecture_Final.this, FinalOne_FileInputOutputStream.class);
                    startActivity(intent);
                }
            }
        });


        spinnerfinaltwo = (Spinner) findViewById(R.id.spinnerfinaltwo);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.FinalTwoLessons, R.layout.spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerfinaltwo.setAdapter(adapter5);
        spinnerfinaltwo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long l) {
                finaltwo.setText(parent.getItemAtPosition(pos).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        finaltwo = (Button) findViewById(R.id.finaltwo);
        finaltwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finaltwo.getText().equals("Swing")) {
                    Intent intent = new Intent(Lecture_Final.this, FinalTwo.class);
                    startActivity(intent);
                } else if (finaltwo.getText().equals("Layout Manager")) {
                    Intent intent = new Intent(Lecture_Final.this, FinalTwo_LayoutManager.class);
                    startActivity(intent);
                } else if (finaltwo.getText().equals("Swing Components")) {
                    Intent intent = new Intent(Lecture_Final.this, FinalTwo_SwingComponents.class);
                    startActivity(intent);
                }
            }
        });

    }

    public void openLecture() {
        Intent intent = new Intent(this, Lecture.class);
        startActivity(intent);
        finish();
    }
    public void onBackPressed() {

    }public void onItemSelected(AdapterView<?> parent, View view,
                                int pos, long id) {
        finalone.setText(parent.getItemAtPosition(pos).toString());


    }

    public void onNothingSelected(AdapterView<?> parent) {
    }


}

