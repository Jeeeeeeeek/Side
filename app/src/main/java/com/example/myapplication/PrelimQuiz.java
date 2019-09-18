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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prelim_quiz);

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
                /*Intent intent = new Intent(PrelimQuiz.this, QuizActivity.class)
                        .putExtra("QuizDetails", "PrelimQuiz")
                        .putExtra("QuizDetails2", "Quiz2");
                startActivity(intent);
                finish();*/

                reference = FirebaseDatabase.getInstance().getReference("Quiz").child("PrelimQuiz")
                        .child("Quiz2");

                HashMap map = new HashMap();
                map.put("answer", "Compare");
                map.put("choice1", "Create");
                map.put("choice2", "Load");
                map.put("choice3", "Compare");
                map.put("choice4", "Compile");
                map.put("question", "Which of the following is not include to five key steps");
                reference.child("1").setValue(map);

                map = new HashMap();
                map.put("answer", "Increase Statement");
                map.put("choice1", "Add statement");
                map.put("choice2", "Increase Statement");
                map.put("choice3", "Increase expression");
                map.put("choice4", "Decrease statement");
                map.put("question", "What does the ++ means?");
                reference.child("2").setValue(map);

                map = new HashMap();
                map.put("answer", "Decrease Statement");
                map.put("choice1", "Increase statement");
                map.put("choice2", "Decrease expression");
                map.put("choice3", "Minus statement");
                map.put("choice4", "Decrease Statement");
                map.put("question", "What does the --means?");
                reference.child("3").setValue(map);

                map = new HashMap();
                map.put("answer", "Decrease Statement");
                map.put("choice1", "Increase statement");
                map.put("choice2", "Decrease expression");
                map.put("choice3", "Minus statement");
                map.put("choice4", "Decrease Statement");
                map.put("question", "Which of the following code are block");///
                reference.child("4").setValue(map);

                map = new HashMap();
                map.put("answer", "Java statement");
                map.put("choice1", "Java Blocks");
                map.put("choice2", "Java statement");
                map.put("choice3", "Java keywords");
                map.put("choice4", "Java Indentifiers");
                map.put("question", "It roughly equivalent to sentences in natural languages.");
                reference.child("5").setValue(map);

                map = new HashMap();
                map.put("answer", "Java Indentifiers");
                map.put("choice1", "Java Blocks");
                map.put("choice2", "Java statement");
                map.put("choice3", "Java keywords");
                map.put("choice4", "Java Indentifiers");
                map.put("question", "All Java components require names. Names used for classes, variables, and methods are called _______.");
                reference.child("6").setValue(map);

                map = new HashMap();
                map.put("answer", "None of the above");
                map.put("choice1", "do");
                map.put("choice2", "double");
                map.put("choice3", "none of the above");
                map.put("choice4", "strictfp");
                map.put("question", "Which of the following is not included to java Keywords");
                reference.child("7").setValue(map);

                map = new HashMap();
                map.put("answer", "new package");
                map.put("choice1", "new package");
                map.put("choice2", "native");
                map.put("choice3", "return");
                map.put("choice4", "long");
                map.put("question", "Which of the following is not included to java Keywords ");
                reference.child("8").setValue(map);

                map = new HashMap();
                map.put("answer", "dowhile");
                map.put("choice1", "volatile");
                map.put("choice2", "dowhile");
                map.put("choice3", "strictfp");
                map.put("choice4", "void");
                map.put("question", "Which of the following is not included to java Keywords");
                reference.child("9").setValue(map);

                map = new HashMap();
                map.put("answer", "Block");
                map.put("choice1", "Declaring");
                map.put("choice2", "Block  statement");
                map.put("choice3", "Java Statement");
                map.put("choice4", "Block");
                map.put("question", "A group of zero or more statements between balanced braces and can be used anywhere a single statement is allowed.");
                reference.child("10").setValue(map);


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
