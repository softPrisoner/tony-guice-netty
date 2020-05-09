package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.OptionalBinder;
import com.rainbow.tony.guice.base.RequestLogger;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description FrameworkLoggingModule
 * @date 2020-05-09
 */
public class FrameworkLoggingModule extends AbstractModule {
    @Override
    protected void configure() {
        OptionalBinder.newOptionalBinder(binder(), RequestLogger.class);
    }
}