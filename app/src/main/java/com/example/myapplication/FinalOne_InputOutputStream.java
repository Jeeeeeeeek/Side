package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class FinalOne_InputOutputStream extends AppCompatActivity {

    TextView textViewInputOutputStream;
    TextView textViewByteStream;
    YouTubePlayerView final1AYtView2;
    Button final1AYtButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_one__input_output_stream);

        textViewInputOutputStream = (TextView)findViewById(R.id.textViewInputOutputStream);
        textViewInputOutputStream.setText(Html.fromHtml(getString(R.string.FinalOneInputOutputStream)));

        textViewByteStream = (TextView)findViewById(R.id.textViewByteStreams);
        textViewByteStream.setText(Html.fromHtml(getString(R.string.FinalOneBytestreams)));

        final1AYtButton = (Button) findViewById(R.id.midtermYtButton4);
        final1AYtView2 = (YouTubePlayerView) findViewById(R.id.final1AYtView2);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("3YRahx2ltSg");//
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