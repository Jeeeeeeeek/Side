package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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

public class FinalTwo_LayoutManager extends YouTubeBaseActivity {


    TextView textViewFinalTwo;
    YouTubePlayerView final1CYtView1;
    YouTubePlayerView final1CYtView2;
    YouTubePlayerView final1CYtView3;
    YouTubePlayerView final1CYtView4;
    Button final1CYtButton;
    Button final1CYtButton2;
    Button final1CYtButton3;
    Button finaltwoBback;
    Button final1CYtButton4;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_two__layout_manager);

        finaltwoBback = (Button) findViewById(R.id.finaltwoBback);

        finaltwoBback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalTwo_LayoutManager.this, Lecture_Final.class);
                startActivity(intent);
            }
        });


        ImageView iv = (ImageView)findViewById(R.id.imageView6);
        iv.setImageResource(R.drawable.finaltwoc1);

        ImageView iv1 = (ImageView)findViewById(R.id.imageView7);
        iv1.setImageResource(R.drawable.finaltwoc2);

        ImageView iv2 = (ImageView)findViewById(R.id.imageView8);
        iv2.setImageResource(R.drawable.finaltwoc3);

        ImageView iv3 = (ImageView)findViewById(R.id.imageView9);
        iv3.setImageResource(R.drawable.finaltwoc4);

        ImageView iv4 = (ImageView)findViewById(R.id.imageView10);
        iv4.setImageResource(R.drawable.finaltwoc5);

        ImageView iv5 = (ImageView)findViewById(R.id.imageView11);
        iv5.setImageResource(R.drawable.finaltwoc6);

        ImageView iv6 = (ImageView)findViewById(R.id.imageView12);
        iv6.setImageResource(R.drawable.finaltwoc7);

        ImageView iv7 = (ImageView)findViewById(R.id.imageView13);
        iv7.setImageResource(R.drawable.finaltwoc8);


        textViewFinalTwo = (TextView)findViewById(R.id.textView10);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager1)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView33);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager2)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView35);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager3)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView36);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager4)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView37);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager5)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView38);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager6)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView39);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager7)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView40);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager8)));

        textViewFinalTwo = (TextView)findViewById(R.id.textView41);
        textViewFinalTwo.setText(Html.fromHtml(getString(R.string.FinalTwoLayoutManager9)));

        //Youtube

        //1st

        final1CYtButton = (Button) findViewById(R.id.final1CYtButton);
        final1CYtView1 = (YouTubePlayerView) findViewById(R.id.final1CYtView1);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("jsroAqOeOmA");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final1CYtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final1CYtView1.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });


        //2nd

        final1CYtButton2 = (Button) findViewById(R.id.final1CYtButton2);
        final1CYtView2 = (YouTubePlayerView) findViewById(R.id.final1CYtView2);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("3EE7E3bvfe8");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final1CYtButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final1CYtView2.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });


        //3rd
        final1CYtButton3 = (Button) findViewById(R.id.final1CYtButton3);
        final1CYtView3 = (YouTubePlayerView) findViewById(R.id.final1CYtView3);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("qhYook53olE");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final1CYtButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final1CYtView3.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

        //4th

        final1CYtButton4 = (Button) findViewById(R.id.final1CYtButton4);
        final1CYtView4 = (YouTubePlayerView) findViewById(R.id.final1CYtView4);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("M1_-sigEPtE");//
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        final1CYtButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final1CYtView4.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}
