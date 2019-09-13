package com.example.myapplication;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class MidtermTwo_TryAndCatch extends YouTubeBaseActivity {

    TextView textView10;

    YouTubePlayerView midtermYtView2;
    Button midtermYtButton2;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_two__try_and_catch);

        textView10 = (TextView)findViewById(R.id.textViewInputOutputStream);
        textView10.setText(Html.fromHtml(getString(R.string.midtermtwo_midtermtryandcatch)));

        midtermYtButton2 = (Button) findViewById(R.id.midtermYtButton2);
        midtermYtView2 = (YouTubePlayerView) findViewById(R.id.final1AYtView2);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                List<String> videoList = new ArrayList<>();
                videoList.add("RrKmwLBEv-U");
                videoList.add("F4uv1ks11Co");
                videoList.add("_dm5E-TUm9E");
                videoList.add("V3X6uV4Xg34");
                videoList.add("0N-DhLQ5pxs");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        midtermYtButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView2.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}
