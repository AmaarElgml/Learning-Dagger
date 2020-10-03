package com.example.daggernerds1.pojo;

import android.util.Log;

import com.example.daggernerds1.ActivityScope;

import javax.inject.Inject;
import javax.inject.Singleton;

@ActivityScope
public class Farm {
    private static final String TAG = "//Farm";

    @Inject
    public Farm() {
        Log.d(TAG, "Amaar Farm: ");
    }

    public String getBeans() {
        return "Beans";
    }
}
