package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.multibindings.OptionalBinder;
import com.rainbow.tony.guice.log.logger.ConsoleLogger;
import com.rainbow.tony.guice.log.logger.RequestLogger;

public class ConsoleLoggingModule extends AbstractModule {

    @Provides
    RequestLogger provideRequestLogger() {
        return new ConsoleLogger(System.out);
    }

    @Override
    protected void configure() {
        OptionalBinder.newOptionalBinder(binder(), RequestLogger.class)
                .setBinding()
                .to(ConsoleLogger.class);
    }
}