package com.rainbow.tony.guice.closableresource;

import com.google.common.io.CharSink;
import com.google.inject.Inject;

import java.io.IOException;

class Client {
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