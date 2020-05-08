package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.rainbow.tony.guice.annotation.Count;
import com.rainbow.tony.guice.annotation.Message;

/**
 * @author tony
 * @copyright rainbow
 * @description DemoModule
 * @date 2020-05-08
 */
public class DemoModule extends AbstractModule {
    /**
     * Note:
     * When you need code to create an object,use an @Provides method.
     * The method must be defined within a module
     */
    @Provides
    @Count
    static Integer providerCount() {
        return 3;
    }

    @Override
    protected void configure() {
        /*
        Avoid using .toInstance with objects that are complicated to create,
        since it can slow down application startup. You can use an @Provides method instead.
         */
        bind(Key.get(String.class, Message.class)).toInstance("hello word");
    }
}
