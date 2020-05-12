package com.rainbow.tony.guice.counter;

import com.google.inject.Inject;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Count
 * @date 2020-05-08
 */
public class Count {

    final Counter counter;

    @Inject
    public Count(Counter counter) {
        this.counter = counter;
    }

    public String execute() {
        return "SUCCESS";
    }

    public int getCount() {
        return counter.increment();
    }
}