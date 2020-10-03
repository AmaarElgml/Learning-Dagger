package com.example.daggernerds1.pojo;

import android.util.Log;

import com.example.daggernerds1.ActivityScope;
import com.example.daggernerds1.Milk;
import com.example.daggernerds1.Sugar;

import javax.inject.Inject;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {
    private static final String TAG = "//Coffee";

    @Inject
    public Farm farm;

    public River river;
    int sugar;
    int milk;

    @Inject
    public Coffee(River river, @Sugar int sugar, @Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Inject
    public void connectingElectricity() {
        Log.d(TAG, "Amaar connectingElectricity: Connecting....");
    }

    public String getCoffeeCup() {
        return farm.getBeans() + "+" + river.getWater() + " + Sugar: " + sugar + " + Milk: " + milk;
    }
}
