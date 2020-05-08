package com.rainbow.tony.guice.demo;

import com.google.inject.Inject;
import com.rainbow.tony.guice.annotation.Count;
import com.rainbow.tony.guice.annotation.Message;

/**
 * @author tony
 * @copyright rainbow
 * @description Greeter
 * @date 2020-05-08
 */
public class Greeter {
    private final String message;
    private final int count;

    @Inject
    public Greeter(@Message String message, @Count int count) {
        this.message = message;
        this.count = count;
    }

    void sayHello() {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
