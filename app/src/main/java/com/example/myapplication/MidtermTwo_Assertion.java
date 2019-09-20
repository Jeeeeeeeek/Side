package com.example.myapplication;

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


public class MidtermTwo_Assertion extends YouTubeBaseActivity {

    TextView textViewAssertion;
    YouTubePlayerView midtermYtView4;
    Button midtermYtButton4;
    Button midtermtwoCback;

    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_two__assertion);


        midtermtwoCback = (Button) findViewById(R.id.midtermtwoCback);

        midtermtwoCback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermTwo_Assertion.this, Lecture_Midterm.class);
                startActivity(intent);
            }
        });

        textViewAssertion = (TextView)findViewById(R.id.textViewAssertion);
        textViewAssertion.setText(Html.fromHtml(getString(R.string.midtermtwo_assertions)));

        midtermYtButton4 = (Button) findViewById(R.id.midtermYtButton4);
        midtermYtView4 = (YouTubePlayerView) findViewById(R.id.midtermYtView4);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("RQ0bZRPYDFE");//
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


