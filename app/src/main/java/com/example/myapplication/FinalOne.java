package com.example.myapplication;

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

public class FinalOne extends YouTubeBaseActivity {

    TextView textViewAssertion;

    YouTubePlayerView finalYTView1;
    Button finalYTButton1;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_one);

        ImageView imgView=(ImageView) findViewById(R.id.imageView2);
        Drawable drawable  = getResources().getDrawable(R.drawable.example1final);
        imgView.setImageDrawable(drawable);



        finalYTButton1 = (Button) findViewById(R.id.finalYTButton1);
        finalYTView1 = (YouTubePlayerView) findViewById(R.id.finalYTView1);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("JceW6zvmA_Q");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        finalYTButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalYTView1.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });
    }
}
