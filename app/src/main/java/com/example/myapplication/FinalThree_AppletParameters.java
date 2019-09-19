package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class FinalThree_AppletParameters extends YouTubeBaseActivity {


    YouTubePlayerView final3CYtView1;
    Button final3CYtButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_three__applet_parameters);

        ImageView iv = (ImageView)findViewById(R.id.imageView14);
        iv.setImageResource(R.drawable.finalthreeb1);

        ImageView iv1 = (ImageView)findViewById(R.id.imageView15);
        iv1.setImageResource(R.drawable.finalthreeb2);

        //Youtube

        final3CYtButton = (Button) findViewById(R.id.final3CYtButton);
        final3CYtView1 = (YouTubePlayerView) findViewById(R.id.final3CYtView1);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("jsroAqOeOmA");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final3CYtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final3CYtView1.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}