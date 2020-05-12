package com.rainbow.tony.guice.counter;

import com.google.inject.servlet.SessionScoped;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Counter
 * @date 2020-05-08
 */
@SessionScoped
public class Counter {

    int count = 0;

    /**
     * Increments the count and returns the new value.
     */
    public synchronized int increment() {
        return count++;
    }
}