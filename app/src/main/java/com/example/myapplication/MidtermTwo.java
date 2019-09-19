package com.example.myapplication;

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

public class MidtermTwo extends YouTubeBaseActivity {

    TextView textView9;
    Button tryandcatchButton, userdefineButton, assertionsButton;
    Button midtermtwoback;

    YouTubePlayerView midtermYtView1;
    Button midtermYtButton1;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    ImageView ImageViewMidtermone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_two);

        midtermYtButton1 = (Button) findViewById(R.id.midtermYtButton1);
        midtermYtView1 = (YouTubePlayerView) findViewById(R.id.midtermYtView1);

        midtermtwoback = (Button) findViewById(R.id.midtermtwoback);

        midtermtwoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermTwo.this, Lecture_Midterm.class);
                startActivity(intent);
            }
        });
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                /*List<String> videoList = new ArrayList<>();
                videoList.add("ohpCMpderow");*/
                youTubePlayer.loadVideo("ohpCMpderow");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        midtermYtButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView1.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

        textView9 = (TextView)findViewById(R.id.textViewfinalA1);
        textView9.setText(Html.fromHtml(getString(R.string.midtermtwo)));


        ImageViewMidtermone = (ImageView) findViewById(R.id.ImageViewfinalA1);
        ImageViewMidtermone.setImageResource(R.drawable.midtermoneimg);
    }

}
