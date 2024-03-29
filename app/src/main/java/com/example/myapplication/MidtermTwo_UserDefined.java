package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MidtermTwo_UserDefined extends YouTubeBaseActivity {

    TextView textViewUserDefined;

    YouTubePlayerView midtermYtView3;
    Button midtermYtButton3;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    Button midterm2Bback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_two__user_defined);

        midterm2Bback = (Button) findViewById(R.id.midtermtwoBback);

        midterm2Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MidtermTwo_UserDefined.this, Lecture_Midterm.class);
                startActivity(intent);
            }
        });


        textViewUserDefined = (TextView)findViewById(R.id.textViewUserDefined);
        textViewUserDefined.setText(Html.fromHtml(getString(R.string.midtermtwo_userdefinedexception)));

        midtermYtButton3 = (Button) findViewById(R.id.final1BYtButton3);
        midtermYtView3 = (YouTubePlayerView) findViewById(R.id.final1BYtView3);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("fsqo7Z4eKE4");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        midtermYtButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView3.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });
    }
}
