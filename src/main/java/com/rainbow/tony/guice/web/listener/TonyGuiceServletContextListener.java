package com.rainbow.tony.guice.web.listener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.rainbow.tony.guice.web.module.BusinessLogicModule;
import com.rainbow.tony.guice.web.module.TonyServletModule;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description TonyGuiceServletContextListener
 * @date 2020-05-11
 */
public class TonyGuiceServletContextListener extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
                new TonyServletModule(),
                new BusinessLogicModule());
    }
}