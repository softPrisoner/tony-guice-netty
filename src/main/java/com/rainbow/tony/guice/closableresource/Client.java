package com.rainbow.tony.guice.closableresource;

import com.google.common.io.CharSink;
import com.google.inject.Inject;

import java.io.IOException;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Client
 * @date 2020-05-11
 */
class Client {
    /**
     * CharSink
     */
    private final CharSink sink;

    /**
     * @param sink  CharSink
     * @param other OtherDependency
     */
    @Inject
    public Client(CharSink sink, OtherDependency other) {
        this.sink = sink;
    }

    public void doSomething() throws IOException {
        //Opens the file at this point, and closes once its done.
        sink.write("hello!");
    }
}