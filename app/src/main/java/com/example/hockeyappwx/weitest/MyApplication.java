package com.example.hockeyappwx.weitest;

import android.app.Application;

import net.hockeyapp.android.CrashManager;

/**
 * Created by HockeyAppWX on 09/06/2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashManager.initialize(this,"3167f1324097418da0a834c954c1cc5f",null);
    }
}
