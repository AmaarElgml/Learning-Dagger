package com.example.daggernerds1;

import com.example.daggernerds1.pojo.Coffee;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
/* True Way but there is better Another way */
//@Component(dependencies = {ComponentApp.class})
@Subcomponent
public interface ComponentCoffee {

    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
//        Builder sugar(@Named("Sugar") int sugar);
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        /* That method was for the dependency way */
//        Builder componentApp(ComponentApp componentApp);

        ComponentCoffee build();
    }

}
