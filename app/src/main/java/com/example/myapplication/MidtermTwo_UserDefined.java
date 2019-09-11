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

import java.util.ArrayList;
import java.util.List;

public class MidtermTwo_UserDefined extends YouTubeBaseActivity {

    TextView textViewUserDefined;

    YouTubePlayerView midtermYtView3;
    Button midtermYtButton3;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_two__user_defined);

        textViewUserDefined = (TextView)findViewById(R.id.textViewUserDefined);
        textViewUserDefined.setText(Html.fromHtml(getString(R.string.midtermtwo_userdefinedexception)));

        midtermYtButton3 = (Button) findViewById(R.id.midtermYtButton3);
        midtermYtView3 = (YouTubePlayerView) findViewById(R.id.midtermYtView3);

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
