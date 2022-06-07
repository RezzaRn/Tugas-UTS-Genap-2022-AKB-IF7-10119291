package com.utsAKB.RezzaRamdhani_10119291;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.xstudioo.noteme.R;

//10119291-Rezza Ramdhani Nashrullah-IF7

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override            public void run() {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
                finish();
            }
        }, 2000L);
        /*Mengatur durasi Splash Screen. 2000L = 2 detik*/
    }
}