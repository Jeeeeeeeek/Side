package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
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

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_progress);

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
        progressDialog.setMessage("Recording");
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


                        scores.add(Integer.parseInt(score));

                    }
                    Toast.makeText(StudentProgressActivity.this, "SSOB: " + scores.size(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        if(scores.size() > 4){
            prelimQuiz1Progress.setProgress(scores.get(0));
            prelimQuiz2Progress.setProgress(scores.get(1));
            prelimQuiz3Progress.setProgress(scores.get(2));

            prelimQuiz1Status.setText(scores.get(0));
            prelimQuiz2Status.setText(scores.get(1));
            prelimQuiz3Status.setText(scores.get(2));
        }else if(scores.size() > 3){
            prelimQuiz1Progress.setProgress(scores.get(0));
            prelimQuiz2Progress.setProgress(scores.get(1));

            prelimQuiz1Status.setText(scores.get(0));
            prelimQuiz2Status.setText(scores.get(1));
            prelimQuiz3Status.setText("Quiz not taken");
        }else if(scores.size() > 2){
            prelimQuiz1Progress.setProgress(scores.get(0));

            prelimQuiz1Status.setText(scores.get(0));
            prelimQuiz2Status.setText("Quiz not taken");
            prelimQuiz3Status.setText("Quiz not taken");
        }else if(scores.isEmpty()){
            prelimQuiz1Status.setText("Quiz not taken");
            prelimQuiz2Status.setText("Quiz not taken");
            prelimQuiz3Status.setText("Quiz not taken");
        }


        DatabaseReference MidtermQuizRecordReference = FirebaseDatabase.getInstance().getReference("Student").child(user.getUid()).child("MidtermQuiz");

        DatabaseReference FinalRecordReference = FirebaseDatabase.getInstance().getReference("Student").child(user.getUid()).child("FinalQuiz");


        progressDialog.dismiss();
    }

}
