package com.rainbow.tony.guice.web.config;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.RequestParameters;
import com.google.inject.servlet.ServletModule;
import com.rainbow.tony.guice.web.filter.MyCssFilter;
import com.rainbow.tony.guice.web.filter.TonyFilter;
import com.rainbow.tony.guice.web.serlvet.TonyServlet;

import java.util.Map;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description MyGuiceServletConfig
 * @date 2020-05-08
 */
public class MyGuiceServletConfig extends GuiceServletContextListener {
    /**
     * Test
     */
    @Inject
    @RequestParameters
    Map<String, String[]> params;

    @Override
    protected Injector getInjector() {
        Guice.createInjector(new ServletModule() {
            @Override
            protected void configureServlets() {
                serve("*.html").with(TonyServlet.class);
                serve("/my/*").with(TonyServlet.class);
                filter("/*").through(TonyFilter.class);
            }
        });

        Guice.createInjector(new ServletModule() {
            @Override
            protected void configureServlets() {
                filter("/*").through(TonyFilter.class);
                filter("*.css").through(MyCssFilter.class);
                serve("*.html").with(TonyServlet.class);
                serve("/my/*").with(TonyServlet.class);
            }
        });
        return Guice.createInjector(new ServletModule());

    }
}