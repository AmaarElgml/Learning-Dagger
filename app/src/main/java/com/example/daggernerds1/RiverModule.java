package com.example.daggernerds1;

import com.example.daggernerds1.pojo.River;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

    @Singleton
    @Provides
    public River getRiver() {
        return new River();
    }

    /* The Issue with use that method that it will consider\save
     the value always as int not as sugar and if we use another variable,
     for example milk it will make an error "Multiple INTEGER Providers" */
//    @Provides
//    public int getSugar() {
//        return sugar;
//    }


}
