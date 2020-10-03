package com.example.daggernerds1;

import android.app.Application;

public class MyApplication extends Application {

    private ComponentApp componentApp;

    @Override
    public void onCreate() {
        super.onCreate();

        /* That instance will be the only Instance of the coffee you can use on the all app */
        componentApp = DaggerComponentApp.create();
    }

    public ComponentApp getComponentApp() {
        return componentApp;
    }
}
