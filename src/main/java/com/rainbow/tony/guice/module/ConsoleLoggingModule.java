package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.rainbow.tony.guice.base.ConsoleLogger;
import com.rainbow.tony.guice.base.RequestLogger;

public class ConsoleLoggingModule extends AbstractModule {

    @Provides
    RequestLogger provideRequestLogger() {
        return new ConsoleLogger(System.out);
    }

    @Override
    protected void configure() {

    }
}