package com.example.looper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ExampleLooperThread eg=new ExampleLooperThread();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startThread(View view){
        eg.start();
    }
    public void stopThread(View view){

    }
    public void taskA(View view){
        eg.handler.post(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Log.d("ExampleLooper","run : "+i);
                    SystemClock.sleep(1000);
                }
            }
        });

    }
    public void taskB(View view){

    }
}