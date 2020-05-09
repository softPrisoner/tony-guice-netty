package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.multibindings.ProvidesIntoOptional;
import com.rainbow.tony.guice.annotation.Count;
import com.rainbow.tony.guice.annotation.Message;
import com.rainbow.tony.guice.log.logger.ConsoleLogger;
import com.rainbow.tony.guice.log.logger.RequestLogger;

/**
 * @author tony
 * @copyright rainbow
 * @description RequestLoggingModule
 * @date 2020-05-08
 */
public class RequestLoggingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Key.get(String.class, Message.class)).toInstance("hello word");
    }

    @Provides
    @Count
    static Integer providerCount() {
        return 3;
    }

    @ProvidesIntoOptional(ProvidesIntoOptional.Type.ACTUAL)
    @Singleton
    RequestLogger provideConsoleLogger() {
        return new ConsoleLogger(System.out);
    }
}
