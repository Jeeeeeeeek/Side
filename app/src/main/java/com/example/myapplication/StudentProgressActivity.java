package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
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
import java.util.Map;

public class StudentProgressActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    DatabaseReference reference;

    RoundCornerProgressBar prelimQuiz1Progress, prelimQuiz2Progress, prelimQuiz3Progress,
            midtermQuiz1Progress, midtermQuiz2Progress, midtermQuiz3Progress,
            finalQuiz1Progress, finalQuiz2Progress, finalQuiz3Progress;

    TextView prelimQuiz1Status, prelimQuiz2Status, prelimQuiz3Status,
            midtermQuiz1Status, midtermQuiz2Status, midtermQuiz3Status,
            finalQuiz1Status, finalQuiz2Status, finalQuiz3Status;

    ArrayList<Integer> scores;

    Button quizprogressback;

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_progress);


        quizprogressback = (Button) findViewById(R.id.quizprogressback);

        quizprogressback
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(StudentProgressActivity.this, Home.class);
                        startActivity(intent);
                    }
                });



        mAuth = FirebaseAuth.getInstance();

        FirebaseUser user = mAuth.getCurrentUser();

        scores = new ArrayList<>();


        prelimQuiz1Progress = (RoundCornerProgressBar) findViewById(R.id.prelimQuiz1Progress);
        prelimQuiz1Progress.setMax(10);

        prelimQuiz2Progress = (RoundCornerProgressBar) findViewById(R.id.prelimQuiz2Progress);
        prelimQuiz2Progress.setMax(10);

        prelimQuiz3Progress = (RoundCornerProgressBar) findViewById(R.id.prelimQuiz3Progress);
        prelimQuiz3Progress.setMax(10);

        midtermQuiz1Progress = (RoundCornerProgressBar) findViewById(R.id.midtermQuiz1Progress);
        midtermQuiz1Progress.setMax(10);

        midtermQuiz2Progress = (RoundCornerProgressBar) findViewById(R.id.midtermQuiz2Progress);
        midtermQuiz2Progress.setMax(10);

        midtermQuiz3Progress = (RoundCornerProgressBar) findViewById(R.id.midtermQuiz3Progress);
        midtermQuiz3Progress.setMax(10);


        finalQuiz1Progress = (RoundCornerProgressBar) findViewById(R.id.finalQuiz1Progress);
        finalQuiz1Progress.setMax(10);

        finalQuiz2Progress = (RoundCornerProgressBar) findViewById(R.id.finalQuiz2Progress);
        finalQuiz2Progress.setMax(10);

        finalQuiz3Progress = (RoundCornerProgressBar) findViewById(R.id.finalQuiz3Progress);
        finalQuiz3Progress.setMax(10);

        prelimQuiz1Status = (TextView) findViewById(R.id.prelimQuiz1Status);
        prelimQuiz2Status = (TextView) findViewById(R.id.prelimQuiz2Status);
        prelimQuiz3Status = (TextView) findViewById(R.id.prelimQuiz3Status);

        midtermQuiz1Status = (TextView) findViewById(R.id.midtermQuiz1Status);
        midtermQuiz2Status = (TextView) findViewById(R.id.midtermQuiz2Status);
        midtermQuiz3Status = (TextView) findViewById(R.id.midtermQuiz3Status);

        finalQuiz1Status = (TextView) findViewById(R.id.finalQuiz1Status);
        finalQuiz2Status = (TextView) findViewById(R.id.finalQuiz2Status);
        finalQuiz3Status = (TextView) findViewById(R.id.finalQuiz3Status);

        progressDialog = new ProgressDialog(StudentProgressActivity.this);
        progressDialog.setMessage("Loading");
        progressDialog.show();

        getQuizScores();

    }

    private void signInAnonymously() {
        mAuth.signInAnonymously()
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(StudentProgressActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(StudentProgressActivity.this, "Authentication failed. Check your internet connection",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public void getQuizScores(){
        FirebaseUser user = mAuth.getCurrentUser();
        DatabaseReference PrelimQuizRecordReference = FirebaseDatabase.getInstance().getReference("Student").child(user.getUid()).child("PrelimQuiz");

        PrelimQuizRecordReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot issue : dataSnapshot.getChildren()) {
                        Map<String, String> map = (Map) issue.getValue();
                        String score = map.get("Score");
                        int scoreInt = Integer.parseInt(score);

                        scores.add(scoreInt);
                    }



                    //#f22613


                }
                if(scores.size() > 2){
                    prelimQuiz1Progress.setProgress(scores.get(0));
                    prelimQuiz2Progress.setProgress(scores.get(1));
                    prelimQuiz3Progress.setProgress(scores.get(2));

                    prelimQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    prelimQuiz2Status.setText(Integer.toString(scores.get(1)) + "/10");
                    prelimQuiz3Status.setText(Integer.toString(scores.get(2)) + "/10");
                }else if(scores.size() > 1){
                    prelimQuiz1Progress.setProgress(scores.get(0));
                    prelimQuiz2Progress.setProgress(scores.get(1));

                    prelimQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    prelimQuiz2Status.setText(Integer.toString(scores.get(1)) + "/10");
                    prelimQuiz3Status.setText("Quiz not taken");
                }else if(scores.size() > 0){
                    prelimQuiz1Progress.setProgress(scores.get(0));

                    prelimQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    prelimQuiz2Status.setText("Quiz not taken");
                    prelimQuiz3Status.setText("Quiz not taken");
                }else if(scores.isEmpty()){
                    prelimQuiz1Status.setText("Quiz not taken");
                    prelimQuiz2Status.setText("Quiz not taken");
                    prelimQuiz3Status.setText("Quiz not taken");
                }
                getMidtermScores();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }

    public void getMidtermScores(){
        FirebaseUser user = mAuth.getCurrentUser();
        DatabaseReference MidtermQuizRecordReference = FirebaseDatabase.getInstance().getReference("Student").child(user.getUid()).child("MidtermQuiz");

        scores.clear();

        MidtermQuizRecordReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot issue : dataSnapshot.getChildren()) {
                        Map<String, String> map = (Map) issue.getValue();
                        String score = map.get("Score");
                        int scoreInt = Integer.parseInt(score);

                        scores.add(scoreInt);
                    }


                }

                if(scores.size() > 2){
                    midtermQuiz1Progress.setProgress(scores.get(0));
                    midtermQuiz2Progress.setProgress(scores.get(1));
                    midtermQuiz3Progress.setProgress(scores.get(2));

                    midtermQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    midtermQuiz2Status.setText(Integer.toString(scores.get(1)) + "/10");
                    midtermQuiz3Status.setText(Integer.toString(scores.get(2)) + "/10");
                }else if(scores.size() > 1){
                    midtermQuiz1Progress.setProgress(scores.get(0));
                    midtermQuiz2Progress.setProgress(scores.get(1));

                    midtermQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    midtermQuiz2Status.setText(Integer.toString(scores.get(1)) + "/10");
                    midtermQuiz3Status.setText("Quiz not taken");
                }else if(scores.size() > 0){
                    midtermQuiz1Progress.setProgress(scores.get(0));

                    midtermQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    midtermQuiz2Status.setText("Quiz not taken");
                    midtermQuiz3Status.setText("Quiz not taken");
                }else if(scores.isEmpty()){
                    midtermQuiz1Status.setText("Quiz not taken");
                    midtermQuiz2Status.setText("Quiz not taken");
                    midtermQuiz3Status.setText("Quiz not taken");
                }

                getFinalScores();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void getFinalScores(){
        FirebaseUser user = mAuth.getCurrentUser();
        DatabaseReference FinalRecordReference = FirebaseDatabase.getInstance().getReference("Student").child(user.getUid()).child("FinalQuiz");

        scores.clear();
        FinalRecordReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot issue : dataSnapshot.getChildren()) {
                        Map<String, String> map = (Map) issue.getValue();
                        String score = map.get("Score");
                        int scoreInt = Integer.parseInt(score);

                        scores.add(scoreInt);
                    }

                }

                if(scores.size() > 2){
                    finalQuiz1Progress.setProgress(scores.get(0));
                    finalQuiz2Progress.setProgress(scores.get(1));
                    finalQuiz3Progress.setProgress(scores.get(2));

                    finalQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    finalQuiz2Status.setText(Integer.toString(scores.get(1)) + "/10");
                    finalQuiz3Status.setText(Integer.toString(scores.get(2)) + "/10");
                }else if(scores.size() > 1){
                    finalQuiz1Progress.setProgress(scores.get(0));
                    finalQuiz2Progress.setProgress(scores.get(1));

                    finalQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    finalQuiz2Status.setText(Integer.toString(scores.get(1)) + "/10");
                    finalQuiz3Status.setText("Quiz not taken");
                }else if(scores.size() > 0){
                    finalQuiz1Progress.setProgress(scores.get(0));

                    finalQuiz1Status.setText(Integer.toString(scores.get(0)) + "/10");
                    finalQuiz2Status.setText("Quiz not taken");
                    finalQuiz3Status.setText("Quiz not taken");
                }else if(scores.isEmpty()){
                    finalQuiz1Status.setText("Quiz not taken");
                    finalQuiz2Status.setText("Quiz not taken");
                    finalQuiz3Status.setText("Quiz not taken");
                }

                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

}
