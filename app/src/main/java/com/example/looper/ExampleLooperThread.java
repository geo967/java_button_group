package com.example.looper;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;

public class ExampleLooperThread extends Thread {

    Handler handler;
    @Override
    public void run() {
        Looper.prepare();

        handler=new Handler();
        /*for (int i = 0; i <10 ; i++) {
            Log.d("ExampleLooper","run : "+i);
            SystemClock.sleep(1000);
        }
        Log.d("ExampleLooper","End of run() ");*/
        Looper.loop();


    }
}
