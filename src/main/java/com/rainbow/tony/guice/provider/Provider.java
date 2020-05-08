package com.rainbow.tony.guice.provider;

interface Provider<T> {
    /**
     * Provides an instance of T.
     **/
    T get();
}