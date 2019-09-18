package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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

public class FinalTwo_SwingComponents extends YouTubeBaseActivity {

    YouTubePlayerView final1BYtView2;
    Button final1BYtButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_two__swing_components);

        ImageView iv = (ImageView)findViewById(R.id.imageView6);
        iv.setImageResource(R.drawable.finaltwob1);

        ImageView iv1 = (ImageView)findViewById(R.id.imageView7);
        iv1.setImageResource(R.drawable.finaltwob2);

        ImageView iv2 = (ImageView)findViewById(R.id.imageView8);
        iv2.setImageResource(R.drawable.finaltwob3);

        ImageView iv3 = (ImageView)findViewById(R.id.imageView9);
        iv3.setImageResource(R.drawable.finaltwob4);

        ImageView iv4 = (ImageView)findViewById(R.id.imageView10);
        iv4.setImageResource(R.drawable.finaltwob5);

        ImageView iv5 = (ImageView)findViewById(R.id.imageView11);
        iv5.setImageResource(R.drawable.finaltwob6);


        final1BYtButton = (Button) findViewById(R.id.final1BYtButton);
        final1BYtView2 = (YouTubePlayerView) findViewById(R.id.final1BYtView2);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("svM0SBFqp4s");//
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

