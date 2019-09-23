package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

public class StudentProgressActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_progress);

        mAuth = FirebaseAuth.getInstance();

        FirebaseUser user = mAuth.getCurrentUser();

        RoundCornerProgressBar prelimQuiz1Progress = (RoundCornerProgressBar) findViewById(R.id.prelimQuiz1Progress);
        prelimQuiz1Progress.setMax(10);
        prelimQuiz1Progress.setProgress(4);

        RoundCornerProgressBar prelimQuiz2Progress = (RoundCornerProgressBar) findViewById(R.id.prelimQuiz2Progress);
        prelimQuiz2Progress.setMax(10);
        prelimQuiz2Progress.setProgress(2);

        RoundCornerProgressBar prelimQuiz3Progress = (RoundCornerProgressBar) findViewById(R.id.prelimQuiz3Progress);
        prelimQuiz3Progress.setMax(10);
        prelimQuiz3Progress.setProgress(8);


        RoundCornerProgressBar midtermQuiz1Progress = (RoundCornerProgressBar) findViewById(R.id.midtermQuiz1Progress);
        midtermQuiz1Progress.setMax(10);
        midtermQuiz1Progress.setProgress(4);

        RoundCornerProgressBar midtermQuiz2Progress = (RoundCornerProgressBar) findViewById(R.id.midtermQuiz2Progress);
        midtermQuiz2Progress.setMax(10);
        midtermQuiz2Progress.setProgress(2);

        RoundCornerProgressBar midtermQuiz3Progress = (RoundCornerProgressBar) findViewById(R.id.midtermQuiz3Progress);
        midtermQuiz3Progress.setMax(10);
        midtermQuiz3Progress.setProgress(8);


        RoundCornerProgressBar finalQuiz1Progress = (RoundCornerProgressBar) findViewById(R.id.finalQuiz1Progress);
        finalQuiz1Progress.setMax(10);
        finalQuiz1Progress.setProgress(4);

        RoundCornerProgressBar finalQuiz2Progress = (RoundCornerProgressBar) findViewById(R.id.finalQuiz2Progress);
        finalQuiz2Progress.setMax(10);
        finalQuiz2Progress.setProgress(2);

        RoundCornerProgressBar finalQuiz3Progress = (RoundCornerProgressBar) findViewById(R.id.finalQuiz3Progress);
        finalQuiz3Progress.setMax(10);
        finalQuiz3Progress.setProgress(8);

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


    }

}
