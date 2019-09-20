package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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


public class FinalOne_FileInputOutputStream extends YouTubeBaseActivity {

    TextView textViewInputOutputStream;
    TextView textViewByteStream;
    TextView textViewFinalOneSubclass;
    YouTubePlayerView final1AYtView2;
    Button final1AYtButton;
    Button finaloneCback;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_one__input_output_stream);

        finaloneCback = (Button) findViewById(R.id.finaloneCback);

        finaloneCback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalOne_FileInputOutputStream.this, Lecture_Final.class);
                startActivity(intent);
            }
        });

        ImageView imgView=(ImageView) findViewById(R.id.imageView6);
        Drawable drawable  = getResources().getDrawable(R.drawable.finaloneaimage1);
        imgView.setImageDrawable(drawable);

        ImageView iv = (ImageView)findViewById(R.id.imageView7);
        iv.setImageResource(R.drawable.finaloneaimage2);


        textViewInputOutputStream = (TextView)findViewById(R.id.textViewInputOutputStream);
        textViewInputOutputStream.setText(Html.fromHtml(getString(R.string.FinalOneInputOutputStream)));

        textViewByteStream = (TextView)findViewById(R.id.textViewByteStreams);
        textViewByteStream.setText(Html.fromHtml(getString(R.string.FinalOneBytestreams)));

        textViewFinalOneSubclass = (TextView)findViewById(R.id.textViewFinalOneSubclass);
        textViewFinalOneSubclass.setText(Html.fromHtml(getString(R.string.FinalOneSubclass)));;


        final1AYtButton = (Button) findViewById(R.id.final1AYtButton);
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