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

public class MidtermThree extends YouTubeBaseActivity {

    TextView textContent;

    YouTubePlayerView midtermYtView4;
    Button midtermYtButton4, buttonInitializingArrays, buttonArrayofObjects, button2DandMDArrays;
    Button midtermthreeback;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_three);


        midtermthreeback = (Button) findViewById(R.id.midtermthreeback);

        midtermthreeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermThree.this, Lecture_Midterm.class);
                startActivity(intent);
            }
        });

        textContent = (TextView)findViewById(R.id.textViewMidtermThree);
        textContent.setText(Html.fromHtml(getString(R.string.midtermthree)));

        midtermYtButton4 = (Button) findViewById(R.id.midtermYtButton4);
        midtermYtView4 = (YouTubePlayerView) findViewById(R.id.midtermYtView4);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("ZVJ7kpEMc7U");
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




