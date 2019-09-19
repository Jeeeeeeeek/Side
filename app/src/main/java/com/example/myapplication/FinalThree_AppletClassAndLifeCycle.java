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

public class FinalThree_AppletClassAndLifeCycle extends YouTubeBaseActivity {


    TextView textViewFinalTwo;
    TextView textViewFinal1;
    YouTubePlayerView final3BYtView1;
    Button final3BYtButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_three__applet_class_and_life_cycle);

        ImageView iv = (ImageView)findViewById(R.id.imageView14);
        iv.setImageResource(R.drawable.finalthreea1);

        ImageView iv1 = (ImageView)findViewById(R.id.imageView15);
        iv1.setImageResource(R.drawable.finalthreea2);

        ImageView iv2 = (ImageView)findViewById(R.id.imageView16);
        iv2.setImageResource(R.drawable.finalthreea3);

        textViewFinalTwo = (TextView)findViewById(R.id.textViewFinalThree);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalThreeA)));

        textViewFinal1 = (TextView)findViewById(R.id.textView34);
        textViewFinal1.setText(Html.fromHtml(getString(R.string.FinalThreeA1)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView35);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalThreeA2)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView36);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalThreeA3)));

        //Youtube

        final3BYtButton = (Button) findViewById(R.id.final3BYtButton);
        final3BYtView1 = (YouTubePlayerView) findViewById(R.id.final3BYtView1);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("anpYxSLLYaA");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final3BYtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final3BYtView1.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}
