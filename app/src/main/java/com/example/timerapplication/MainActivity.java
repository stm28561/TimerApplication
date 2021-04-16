package com.example.timerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int seconds = 0;
    private boolean isRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStartTimer(View view) {
        isRunning = true;
    }

    public void onClickStopTimer(View view) {
        isRunning = false;
    }

    public void onClickResetTimer(View view) {
        isRunning = false;
        seconds = 0;
    }

    private void runTimer() {
        int hours = seconds/3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;

        String time = String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, sec);
    }
}