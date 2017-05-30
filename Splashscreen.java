package com.example.sosmed06.logistic;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by sosmed06 on 5/30/17.
 */

public class Splashscreen extends AppCompatActivity {

    private static int SplashInternal = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {


                Intent i = new Intent(Splashscreen.this,MainActivity.class);

                startActivity(i);

                this.finish();
            }
            private void finish() {

    }

}, SplashInternal);

    };

}


