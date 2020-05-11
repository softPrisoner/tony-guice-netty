package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.rainbow.tony.guice.annotation.FooServerAddress;

/**
 * FooModule
 *
 * @author tony
 * @copyright rainbow
 * @description FooModule
 * @date 2020-05-08
 */
public class FooModule extends AbstractModule {
    private final String fooServerAddress;

    /**
     * @param fooServerAddress the URL of the foo server.
     */
    public FooModule(String fooServerAddress) {
        this.fooServerAddress = fooServerAddress;
    }

    @Override
    public void configure() {
        bindConstant().annotatedWith(FooServerAddress.class).to(fooServerAddress);
    }
}