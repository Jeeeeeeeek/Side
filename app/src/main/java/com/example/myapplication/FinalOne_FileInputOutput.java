package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class FinalOne_FileInputOutput extends YouTubeBaseActivity {



    YouTubePlayerView final1BYtView3;
    Button final1BYtButton3;
    Button finaloneAback;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_one__file_input_output);

        finaloneAback = (Button) findViewById(R.id.finaloneAback);

        finaloneAback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalOne_FileInputOutput.this, Lecture_Final.class);
                startActivity(intent);
            }
        });


        final1BYtButton3 = (Button) findViewById(R.id.final1BYtButton3);
        final1BYtView3 = (YouTubePlayerView) findViewById(R.id.final1BYtView3);


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("_jhCvy8_lGE");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final1BYtButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final1BYtView3.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });
    }
}

