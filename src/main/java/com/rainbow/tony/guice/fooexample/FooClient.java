package com.rainbow.tony.guice.fooexample;

import com.google.inject.Inject;
import com.rainbow.tony.guice.annotation.FooServerAddress;

/**
 * FooClient
 *
 * @author tony
 * @copyright rainbow
 * @description FooClient
 * @date 2020-05-08
 */
public class FooClient {

    @Inject
    FooClient(@FooServerAddress String fooServerAddress) {
    }
}