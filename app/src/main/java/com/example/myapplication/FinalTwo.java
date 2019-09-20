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

public class FinalTwo extends YouTubeBaseActivity {
    TextView textViewFinalTwo;
    YouTubePlayerView final1AYtView2;
    Button final1AYtButton;
    Button finaltwoback;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_two);

        finaltwoback = (Button) findViewById(R.id.finaltwoback);

        finaltwoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalTwo.this, Lecture_Final.class);
                startActivity(intent);
            }
        });

        ImageView iv = (ImageView)findViewById(R.id.imageView6);
        iv.setImageResource(R.drawable.finaltwo1);

        ImageView iv1 = (ImageView)findViewById(R.id.imageView7);
        iv1.setImageResource(R.drawable.finaltwo2);

        textViewFinalTwo = (TextView)findViewById(R.id.textViewFinalTwo);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwo)));

        final1AYtButton = (Button) findViewById(R.id.final1AYtButton);
        final1AYtView2 = (YouTubePlayerView) findViewById(R.id.final1AYtView2);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("jUEOWVjnIR8");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final1AYtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final1AYtView2.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}

