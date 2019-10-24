package com.app_dev.criss.docsexpirationreminder;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME = 2000;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar = findViewById(R.id.progressBar3);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);

                Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);
                if (isFirstRun){
                    //show welcome activity
                    startActivity(new Intent(SplashActivity.this, WelcomeActivity.class));
                } else {
                    //show app's home screen
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }

                getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isFirstRun", false).commit();

                finish();
            }
        }, SPLASH_TIME);
    }
}
