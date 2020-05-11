package com.rainbow.tony.guice.module;

import com.google.inject.PrivateModule;
import com.rainbow.tony.guice.base.Leg;

import java.lang.annotation.Annotation;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description LegModule
 * @date 2020-05-09
 */
abstract class LegModule extends PrivateModule {
    private final Class<? extends Annotation> annotation;

    LegModule(Class<? extends Annotation> annotation) {
        this.annotation = annotation;
    }

    @Override
    protected void configure() {
        bind(Leg.class).annotatedWith(annotation).to(Leg.class);
        expose(Leg.class).annotatedWith(annotation);

        bindFoot();
    }

    abstract void bindFoot();

}