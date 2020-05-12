package com.rainbow.tony.guice.persist.jpa.module;

import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description MyModule
 * @date 2020-05-11
 */
public class MyModule extends ServletModule {
    @Override
    protected void configureServlets() {
        install(new JpaPersistModule("myJpaUnit"));
        filter("/*").through(PersistFilter.class);
    }
}