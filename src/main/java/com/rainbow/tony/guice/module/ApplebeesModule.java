package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.rainbow.tony.guice.scope.Applebees;
import com.rainbow.tony.guice.scope.Bar;
import com.rainbow.tony.guice.scope.Grill;

/**
 * @author tony
 * @copyright rainbow
 * @description ApplebeesModule
 * @date 2020-05-08
 */
public class ApplebeesModule extends AbstractModule {
    @Override
    protected void configure() {
        /*
         If multi subject will be not singleton object.
         So if we want to inject the same  object we should to @Singleton
         or bind Applebees.class and scope in Singleton.class
         */
        bind(Applebees.class).in(Singleton.class);

        /*
        #.asEagerSingleton()	eager	eager
        #.in(Singleton.class)	eager	lazy
        #.in(Scopes.SINGLETON)	eager	lazy
        #@Singleton	            eager*	lazy
         */
        //Create bean with eager
        bind(Bar.class).to(Applebees.class).asEagerSingleton();
        /*
        Create bean with lazy
         */
        bind(Grill.class).to(Applebees.class).in(Singleton.class);
    }
}
