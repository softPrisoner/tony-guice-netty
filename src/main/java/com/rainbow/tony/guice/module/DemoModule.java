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
    @Override
    protected void configure() {
        bind(Key.get(String.class, Message.class)).toInstance("hello word");
    }

    @Provides
    @Count
    static Integer providerCount() {
        return 3;
    }
}
