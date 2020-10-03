package com.example.daggernerds1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.daggernerds1.pojo.Coffee;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "//MainActivity";

    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* The Manual Dependency Injection */
//        Farm farm = new Farm();
//        River river = new River();
//
//        Coffee coffee = new Coffee(farm, river);
//        coffee.getCoffee();

        /* The Issue with that way of DI is that you will type a Boilerplate Code (Dummy code) */
        /* So we will turn it to Automated DI */

        /* The Automated Dependency Injection */

        ComponentApp componentApp = ((MyApplication) getApplication()).getComponentApp();

        /* ComponentCoffee becomes an SubComponent So it has no Generated Class (DaggerComponentCoffee) from Dagger anymore */
        /* But we have built an method on ComponentApp that defines it's SubComponents so we will use that builder */
        /* And we will remove componentApp(componentApp) Method also because we will not need it anymore, since we use componentApp's Builder Method */
        ComponentCoffee componentCoffee = componentApp.getComponentCoffeeBuilder()
                .milk(4).sugar(5).build();

        componentCoffee.inject(this);

        Log.d(TAG, "Amaar: " + coffee.getCoffeeCup()
                + "\n\nCoffee1" + coffee
                + "\nCoffee2" + coffee2
                + "\n\nRiver1" + coffee.river
                + "\nRiver2" + coffee2.river
                + "\n\nFarm1" + coffee.farm
                + "\nFarm2" + coffee2.farm );

    }

}