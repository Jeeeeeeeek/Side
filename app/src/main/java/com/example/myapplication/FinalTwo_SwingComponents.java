package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class FinalTwo_SwingComponents extends AppCompatActivity {

    YouTubePlayerView final1BYtView2;
    Button final1BYtButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_two__swing_components);


        final1BYtButton = (Button) findViewById(R.id.final1BYtButton);
        final1BYtView2 = (YouTubePlayerView) findViewById(R.id.final1BYtView2);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("UEOWVjnIR8");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final1BYtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final1BYtView2.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}

