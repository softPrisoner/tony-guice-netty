package com.rainbow.tony.guice.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rainbow.tony.guice.module.AuthenticationModule;
import com.rainbow.tony.guice.module.DatabaseModule;
import com.rainbow.tony.guice.module.RequestHandlerModule;
import com.rainbow.tony.guice.module.RequestLoggingModule;

/**
 * MyWebServer
 *
 * @author tony
 * @copyright rainbow
 * @description MyWebServer
 * @date 2020-05-08
 */
public final class MyWebServer {
    public void start() {
        System.out.println();
    }

    public static void main(String[] args) {
        // Creates an injector that has all the necessary dependencies needed to
        // build a functional server.
        Injector injector = Guice.createInjector(
                new RequestLoggingModule(),
                new RequestHandlerModule(),
                new AuthenticationModule(),
                new DatabaseModule());
        // Bootstrap the application by creating an instance of the server then
        // start the server to handle incoming requests.
        injector.getInstance(MyWebServer.class)
                .start();
    }
}