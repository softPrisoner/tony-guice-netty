package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description ExplicitBindingModule
 * @date 2020-05-09
 */
public class ExplicitBindingModule extends AbstractModule {
    @Override
    protected void configure() {
        binder().requireExplicitBindings();
    }
}
