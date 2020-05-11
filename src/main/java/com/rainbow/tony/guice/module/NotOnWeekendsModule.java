package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.rainbow.tony.guice.annotation.NotOnWeekends;
import com.rainbow.tony.guice.aop.WeekendBlocker;

import java.util.Calendar;

import static com.google.inject.matcher.Matchers.annotatedWith;
import static com.google.inject.matcher.Matchers.any;

/**
 * @author tony
 * @copyright rainbow
 * @description NotOnWeekendsModule
 * @date 2020-05-08
 */
public class NotOnWeekendsModule extends AbstractModule {
    @Override
    protected void configure() {
        /*
        Classes must be public or package-private.
        Classes must be non-final
        Methods must be public, package-private or protected
        Methods must be non-final
        Instances must be created by Guice by an @Inject-annotated or no-argument constructor.
        It is not possible to use method interception on instances that aren't constructed by Guice.
         */
        bindInterceptor(any(), annotatedWith(NotOnWeekends.class), new WeekendBlocker());
        bindInterceptor(any(),
                annotatedWith(NotOnWeekends.class),
                new WeekendBlocker(getProvider(Calendar.class)));
    }
}