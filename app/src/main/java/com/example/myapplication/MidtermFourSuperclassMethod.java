package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MidtermFourSuperclassMethod extends YouTubeBaseActivity {

    TextView textViewAssertion;

    YouTubePlayerView midtermYtView4;
    Button midtermfourCback;
    Button midtermYtButton4;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_four_superclass_method);




        midtermfourCback = (Button) findViewById(R.id.midtermfourCback);

        midtermfourCback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermFourSuperclassMethod.this, Lecture_Midterm.class);
                startActivity(intent);
            }
        });

        textViewAssertion = (TextView)findViewById(R.id.textViewAssertion);
        textViewAssertion.setText(Html.fromHtml(getString(R.string.MidtermFourSuperclassMethod)));

        midtermYtButton4 = (Button) findViewById(R.id.midtermYtButton4);
        midtermYtView4 = (YouTubePlayerView) findViewById(R.id.midtermYtView4);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("T7Es2C-z0NM"); // SubClasses and SuperClasses in Java
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        midtermYtButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView4.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}
