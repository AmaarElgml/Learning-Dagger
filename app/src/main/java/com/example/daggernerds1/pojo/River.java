package com.example.daggernerds1.pojo;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "//River";

//    @Inject
    public River() {
        Log.d(TAG, "Amaar River: ");
    }

    public String getWater() {
        return "Water";
    }

}
