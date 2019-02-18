package com.example.mp5;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;

    private MediaPlayer mediaPlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonPlay, buttonStop;

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setImageResource(R.drawable.record);

        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton1);

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.random_access_memories);

                if (mediaPlayer1 != null) {
                    mediaPlayer1.stop();
                    mediaPlayer1.release();
                    mediaPlayer1 = null;
                }

                mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.lose_yourself_to_dance);
                mediaPlayer1.start();

            }
        });

        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.after_the_storm);

                if (mediaPlayer1 != null) {
                    mediaPlayer1.stop();
                    mediaPlayer1.release();
                    mediaPlayer1 = null;
                }

                mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.after_the_storm);
                mediaPlayer1.start();
            }
        });

        final RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.peach_fuzz_image);

                if (mediaPlayer1 != null) {
                    mediaPlayer1.stop();
                    mediaPlayer1.release();
                    mediaPlayer1 = null;
                }

                mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.peach_fuzz);
                mediaPlayer1.start();
            }
        });

        buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!radioButton1.isChecked() && !radioButton2.isChecked() && !radioButton3.isChecked()){
                    Toast.makeText(getApplicationContext(), "Please choose song to play.",Toast.LENGTH_LONG).show();
                } else if(radioButton1.isChecked()){
                    mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.lose_yourself_to_dance);
                    mediaPlayer1.start();
                } else if (radioButton2.isChecked()) {
                    mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.after_the_storm);
                    mediaPlayer1.start();
                } else if (radioButton3.isChecked()) {
                    mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.peach_fuzz);
                    mediaPlayer1.start();
                }
            }
        });

        buttonStop = (Button) findViewById(R.id.buttonStop);
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!radioButton1.isChecked() && !radioButton2.isChecked() && !radioButton3.isChecked()){
                    Toast.makeText(getApplicationContext(), "Please choose song to play.",Toast.LENGTH_LONG).show();
                }
                if (mediaPlayer1 != null) {
                    mediaPlayer1.stop();
                }
            }
        });

    }
}
