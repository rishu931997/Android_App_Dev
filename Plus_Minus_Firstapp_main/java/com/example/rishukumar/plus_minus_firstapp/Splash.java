package com.example.rishukumar.plus_minus_firstapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Rishu Kumar on 10/06/2016.
 */
public class Splash extends Activity{
    MediaPlayer oursong;
    @Override
    protected void onCreate(Bundle LoveHate) {
        super.onCreate(LoveHate);
        setContentView(R.layout.splash);
        oursong=MediaPlayer.create(Splash.this,R.raw.hero);
        oursong.start();
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(7000);

                } catch (InterruptedException e){
                    e.printStackTrace();

                } finally {
                    Intent openMainActivity= new Intent("com.example.rishukumar.plus_minus_firstapp.MAINACTIVITY");
                    startActivity(openMainActivity);

                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        oursong.release();
        finish();
    }
}
