package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MidtermThree_2DandMDArrays extends YouTubeBaseActivity {

    TextView textViewAssertion3;
    Button midtermthreeBback;
    YouTubePlayerView midtermYtView4;
    Button midtermYtButton4;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    YouTubePlayerView midtermYtView5;
    Button midtermYtButton5;
    YouTubePlayer.OnInitializedListener mOnInitializedListener2;

    YouTubePlayerView midtermYtView6;
    Button midtermYtButton6;
    YouTubePlayer.OnInitializedListener mOnInitializedListener3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_three_2_dand_mdarrays);

        midtermthreeBback = (Button) findViewById(R.id.midtermthreeBback);

        midtermthreeBback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermThree_2DandMDArrays.this, Lecture_Midterm.class);
                startActivity(intent);
            }
        });


        midtermYtButton4 = (Button) findViewById(R.id.midtermYtButton4);
        midtermYtView4 = (YouTubePlayerView) findViewById(R.id.midtermYtView4);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("udHgmxK9oAI");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult
                    youTubeInitializationResult) {

            }
        };

        midtermYtButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView4.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

        midtermYtButton5 = (Button) findViewById(R.id.midtermYtButton5);
        midtermYtView5 = (YouTubePlayerView) findViewById(R.id.midtermYtView5);

        mOnInitializedListener2 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("d8x5Nciymjs");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult
                    youTubeInitializationResult) {

            }
        };

        midtermYtButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView5.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener2);
            }
        });

        textViewAssertion3 = (TextView)findViewById(R.id.textViewAssertion3);
        textViewAssertion3.setText(Html.fromHtml(getString(R.string.midtermthree2DandMDArray)));

        midtermYtButton6 = (Button) findViewById(R.id.midtermYtButton6);
        midtermYtView6 = (YouTubePlayerView) findViewById(R.id.midtermYtView6);

        mOnInitializedListener3 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("VE0HeWFaAIQ");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult
                    youTubeInitializationResult) {

            }
        };

        midtermYtButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView6.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener3);
            }
        });

    }


}

