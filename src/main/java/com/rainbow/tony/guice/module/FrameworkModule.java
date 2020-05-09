package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.multibindings.ProvidesIntoOptional;
import com.rainbow.tony.guice.log.logger.DefaultRequestLoggerImpl;
import com.rainbow.tony.guice.log.logger.RequestLogger;


/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description FrameworkModule
 * @date 2020-05-09
 */
public class FrameworkModule extends AbstractModule {
    @ProvidesIntoOptional(ProvidesIntoOptional.Type.DEFAULT)
    @Singleton
    RequestLogger provideConsoleLogger() {
        return new DefaultRequestLoggerImpl();
    }

    @Override
    protected void configure() {

    }
}