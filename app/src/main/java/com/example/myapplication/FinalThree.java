package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class FinalThree extends YouTubeBaseActivity {
    TextView textViewFinalThreeA;
    YouTubePlayerView final3AYtView1;
    Button final3AYtButton;
    Button finalthreeback;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_three);

        finalthreeback = (Button) findViewById(R.id.finalthreeback);

        finalthreeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalThree.this, Lecture_Final.class);
                startActivity(intent);
            }
        });


        textViewFinalThreeA = (TextView)findViewById(R.id.textViewFinalThreeA);
        textViewFinalThreeA.setText(Html.fromHtml(getString(R.string.FinalThree)));

        final3AYtButton = (Button) findViewById(R.id.final3AYtButton);
        final3AYtView1 = (YouTubePlayerView) findViewById(R.id.final3AYtView1);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("UGLWTXslfyo");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final3AYtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final3AYtView1.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}
