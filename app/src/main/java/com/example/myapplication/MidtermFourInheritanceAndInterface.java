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

public class MidtermFourInheritanceAndInterface extends YouTubeBaseActivity {

    TextView textViewAssertion,textViewAssertion2;

    YouTubePlayerView midtermYtView4;
    Button midtermYtButton4;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    YouTubePlayerView midtermYtView5;
    Button midtermYtButton5;
    YouTubePlayer.OnInitializedListener mOnInitializedListener2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_four_inheritance_and_interface);

        textViewAssertion = (TextView)findViewById(R.id.textViewAssertion);
        textViewAssertion.setText(Html.fromHtml(getString(R.string.MidtermFourInterface)));

        textViewAssertion2 = (TextView)findViewById(R.id.textViewAssertion2);
        textViewAssertion2.setText(Html.fromHtml(getString(R.string.MidtermFourInheritancee)));

        midtermYtButton4 = (Button) findViewById(R.id.midtermYtButton4);
        midtermYtView4 = (YouTubePlayerView) findViewById(R.id.midtermYtView4);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("Ggjxn8Q9VuE");//asd
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult
                    youTubeInitializationResult) {

            }
        };

        midtermYtButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView4.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

        midtermYtButton5 = (Button) findViewById(R.id.midtermYtButton5);
        midtermYtView5 = (YouTubePlayerView) findViewById(R.id.midtermYtView5);

        mOnInitializedListener2 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("361J5nra5PU");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult
                    youTubeInitializationResult) {

            }
        };
        midtermYtButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midtermYtView5.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });
    }
}
