package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QuizActivity extends AppCompatActivity {

    DatabaseReference reference;

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button buttonStart;

    String quizDetails, quizDetails2;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    ProgressDialog progressDialog;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        buttonStart = (Button)findViewById(R.id.buttonStart);

        mAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(QuizActivity.this);
        progressDialog.setMessage("Loading questions");
        progressDialog.show();

        getQuestions();

        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                updateQuestion();
                buttonStart.setVisibility(View.INVISIBLE);
                mButtonChoice1.setVisibility(View.VISIBLE);
                mButtonChoice2.setVisibility(View.VISIBLE);
                mButtonChoice3.setVisibility(View.VISIBLE);
                mButtonChoice4.setVisibility(View.VISIBLE);
                mQuestionView.setVisibility(View.VISIBLE);
            }
        });

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice1.getText().equals(mAnswer)){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice2.getText().equals(mAnswer)){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice3.getText().equals(mAnswer)){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice4.getText().equals(mAnswer)){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }

    ArrayList<String[]> choicesArray;
    ArrayList<String>  questionsArray;
    ArrayList<String> answersArray;
    int ctr;

    private void updateQuestion(){

        if(mQuestionNumber < questionsArray.size()){
            mQuestionView.setText(questionsArray.get(mQuestionNumber));
            mButtonChoice1.setText(choicesArray.get(mQuestionNumber)[0]);
            mButtonChoice2.setText(choicesArray.get(mQuestionNumber)[1]);
            mButtonChoice3.setText(choicesArray.get(mQuestionNumber)[2]);
            mButtonChoice4.setText(choicesArray.get(mQuestionNumber)[3]);

            mAnswer = answersArray.get(mQuestionNumber);

            mQuestionNumber++;

        }else{
            recordQuiz();
            new AlertDialog.Builder(QuizActivity.this)
                    .setTitle("Done!")
                    .setMessage("Congratulations for taking the quiz, your score is " + mScore)
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(QuizActivity.this, QuizHome.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .show();
        }


    }

    public void getQuestions(){

        choicesArray = new ArrayList<String[]>();
        questionsArray = new ArrayList<>();
        answersArray = new ArrayList<>();

        Intent intent = getIntent();
        ctr = 0;
        quizDetails  = intent.getStringExtra("QuizDetails");
        quizDetails2  = intent.getStringExtra("QuizDetails2");

        reference = FirebaseDatabase.getInstance().getReference("Quiz").child(quizDetails)
                .child(quizDetails2);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot issue : dataSnapshot.getChildren()) {
                        Map<String, String> map = (Map) issue.getValue();
                        String answer = map.get("answer");
                        String choice1 = map.get("choice1");
                        String choice2 = map.get("choice2");
                        String choice3 = map.get("choice3");
                        String choice4 = map.get("choice4");
                        String question = map.get("question");


                        String[] choices = {choice1, choice2, choice3, choice4};
                        choicesArray.add(choices);
                        answersArray.add(answer);
                        questionsArray.add(question);

                    }
                    progressDialog.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(QuizActivity.this, "Can't connect to the server. Check your internet connection", Toast.LENGTH_SHORT).show();
            }

        });

    }

    public void recordQuiz(){
        progressDialog.setMessage("Recording");
        progressDialog.show();

        FirebaseUser user = mAuth.getCurrentUser();

        if(user != null){
            DatabaseReference quizRecordReference = FirebaseDatabase.getInstance().getReference("Student").child(user.getUid()).child(quizDetails).child(quizDetails2);

            Map<String, String> map = new HashMap<>();
            map.put("Score", Integer.toString(mScore));

            quizRecordReference.setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    Toast.makeText(QuizActivity.this, "Quiz recorded successfully.",
                            Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            });

        }else{
            signInAnonymously();
        }

    }

    private void signInAnonymously() {
        mAuth.signInAnonymously()
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            recordQuiz();

                            progressDialog.dismiss();
                        } else {
                            Toast.makeText(QuizActivity.this, "Quiz recording failed. Check your internet connection",
                                    Toast.LENGTH_SHORT).show();

                            progressDialog.dismiss();
                        }
                    }
                });
    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}
