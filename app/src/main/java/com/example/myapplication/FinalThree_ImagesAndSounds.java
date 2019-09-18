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

public class FinalThree_ImagesAndSounds extends YouTubeBaseActivity {

        TextView textViewFinalThree;
        YouTubePlayerView final3DYtView1;
        YouTubePlayerView final3DYtView2;
        Button final3DYtButton;
        Button final3DYtButton2;
        YouTubePlayer.OnInitializedListener mOnInitializedListener;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_three__images_and_sounds);

        ImageView iv = (ImageView)findViewById(R.id.imageView13);
        iv.setImageResource(R.drawable.finalthreed1);

        ImageView iv1 = (ImageView)findViewById(R.id.imageView14);
        iv1.setImageResource(R.drawable.finalthreed2);

        ImageView iv2 = (ImageView)findViewById(R.id.imageView15);
        iv2.setImageResource(R.drawable.finalthreed3);

        textViewFinalThree = (TextView)findViewById(R.id.textViewFinalThree);
        textViewFinalThree.setText(Html.fromHtml(getString(R.string.FinalThreeD)));

        textViewFinalThree = (TextView)findViewById(R.id.textView34);
        textViewFinalThree.setText(Html.fromHtml(getString(R.string.FinalThreeD1)));

        //Youtube


        final3DYtButton = (Button) findViewById(R.id.final3DYtButton);
        final3DYtView1 = (YouTubePlayerView) findViewById(R.id.final3DYtView1);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("jsroAqOeOmA");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

            final3DYtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final3DYtView1.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

        //2nd
            final3DYtButton2 = (Button) findViewById(R.id.final3DYtButton2);
            final3DYtView2 = (YouTubePlayerView) findViewById(R.id.final3DYtView2);

            mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
                @Override
                public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                    youTubePlayer.loadVideo("jsroAqOeOmA");//
                }

                @Override
                public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                }
            };

            final3DYtButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final3DYtView2.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
                }
            });

    }
    }