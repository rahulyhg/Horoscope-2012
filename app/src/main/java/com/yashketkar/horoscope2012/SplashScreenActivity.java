package com.yashketkar.horoscope2012;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (waited < 5000) {
                        sleep(100);
                        waited += 100;
                    }
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    finish();
                    Intent intent = new Intent(SplashScreenActivity.this, BirthDateChooserActivity.class);
                    startActivity(intent);
                }
            }
        };
        splashThread.start();
    }
}