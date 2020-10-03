package com.example.daggernerds1;

import com.example.daggernerds1.pojo.Farm;
import com.example.daggernerds1.pojo.River;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
public interface ComponentApp {

    /* Defining the SubComponent On the Parent Component (Mother Component)  */
    ComponentCoffee.Builder getComponentCoffeeBuilder();

    /* True Way but there is better Another way */
//    River getRiver();
//    Farm getFarm();



}
