package com.rainbow.tony.guice.web.module;

import com.google.inject.servlet.ServletModule;
import com.rainbow.tony.guice.web.serlvet.TonyServlet;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description TonyServletModule
 * @date 2020-05-11
 */
public class TonyServletModule extends ServletModule {
    @Override
    protected void configureServlets() {
        serve("/*").with(TonyServlet.class);
    }
}