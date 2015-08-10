package com.example.wuxiaoxiao.drawingfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Van on 8/10/2015.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                    Intent menuIntent = new Intent(Splash.this, MainActivity.class);
                    startActivity(menuIntent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }

        };
        logoTimer.start();
    }

    private void startActivity() {
    }
}
