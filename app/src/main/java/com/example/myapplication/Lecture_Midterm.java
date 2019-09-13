package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Lecture_Midterm extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button btnMidtermBack,midtermone,midtermtwo,midtermthree,midtermfour;
    Spinner spinnerMidtermTwo;
    Spinner spinnerMidtermThree;
    Spinner spinnerMidtermFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture__midterm);


        spinnerMidtermTwo = (Spinner) findViewById(R.id.spinnerMidtermTwo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.MidtermTwoLessons, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMidtermTwo.setAdapter(adapter);
        spinnerMidtermTwo.setOnItemSelectedListener(this);


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
                if(midtermtwo.getText().equals("Exception Handling")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermTwo.class);
                    startActivity(intent);
                    finish();
                }else if(midtermtwo.getText().equals("User Defined Exceptions")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermTwo_UserDefined.class);
                    startActivity(intent);
                    finish();
                }else if(midtermtwo.getText().equals("Assertions")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermTwo_Assertion.class);
                    startActivity(intent);
                    finish();
                }else if(midtermtwo.getText().equals("Try and Catch")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermTwo_TryAndCatch.class);
                    startActivity(intent);
                    finish();
                }


            }
        });

        spinnerMidtermThree = (Spinner) findViewById(R.id.spinnerMidtermThree);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.MidtermThreeLessons, R.layout.spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMidtermThree.setAdapter(adapter2);
        spinnerMidtermThree.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long l) {
                midtermthree.setText(parent.getItemAtPosition(pos).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        midtermthree = (Button) findViewById(R.id.midtermthree);
        midtermthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(midtermthree.getText().equals("Arrays and Array List")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermThree.class);
                    startActivity(intent);
                    finish();
                }else if(midtermthree.getText().equals("Declaring and Initializing Arrays")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermThree_InitializingArrays.class);
                    startActivity(intent);
                    finish();
                }else if(midtermthree.getText().equals("Array of Objects")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermThree_ArrayofObjects.class);
                    startActivity(intent);
                    finish();
                }else if(midtermthree.getText().equals("2D and Multidimentional Array")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermThree_2DandMDArrays.class);
                    startActivity(intent);
                    finish();
                }
            }
        });


        spinnerMidtermFour = (Spinner) findViewById(R.id.spinnerMidtermFour);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.MidtermFourLessons, R.layout.spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMidtermFour.setAdapter(adapter3);
        spinnerMidtermFour.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long l) {
                midtermfour.setText(parent.getItemAtPosition(pos).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        midtermfour = (Button) findViewById(R.id.midtermfour);
        midtermfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(midtermfour.getText().equals("Inheritance and Interface")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermFourInheritanceAndInterface.class);
                    startActivity(intent);
                    finish();
                }else if(midtermfour.getText().equals("Method Overriding")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermFourMethodOverriding.class);
                    startActivity(intent);
                    finish();
                }else if(midtermfour.getText().equals("Constructors During Inheritance")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermFourConstructorsDuringInheritance.class);
                    startActivity(intent);
                    finish();
                }else if(midtermfour.getText().equals("Superclass Method")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermFourSuperclassMethod.class);
                    startActivity(intent);
                    finish();
                }else if(midtermfour.getText().equals("Information Hiding")){
                    Intent intent = new Intent(Lecture_Midterm.this, MidtermFourInformationHiding.class);
                    startActivity(intent);
                    finish();
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
 }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        midtermtwo.setText(parent.getItemAtPosition(pos).toString());


    }

    public void onNothingSelected(AdapterView<?> parent) {
    }


}

