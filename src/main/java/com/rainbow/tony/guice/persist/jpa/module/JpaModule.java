package com.rainbow.tony.guice.persist.jpa.module;

import com.google.inject.*;
import com.google.inject.persist.jpa.JpaPersistModule;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description JpaModule
 * @date 2020-05-11
 */
public class JpaModule extends AbstractModule {
    /**
     * name
     */
    private final String name;

    public JpaModule(String name) {
        this.name = name;
    }

    @Override
    protected void configure() {

        Injector injector = Guice.createInjector(new JpaPersistModule("myFirstJpaUnit"));

        Module one = new PrivateModule() {
            @Override
            protected void configure() {
                install(new JpaModule("persistenceUnitOne"));
            }
        };


        Module two = new PrivateModule() {
            @Override
            protected void configure() {
                install(new JpaModule("persistenceUnitTwo"));
            }
        };
    }
}
