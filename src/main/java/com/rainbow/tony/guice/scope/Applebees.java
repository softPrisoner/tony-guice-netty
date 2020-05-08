package com.rainbow.tony.guice.scope;

import com.google.inject.Singleton;

/**
 * @author tony
 * @copyright rainbow
 * @description Applebees
 * @date 2020-05-08
 */
@Singleton
public class Applebees implements Bar, Grill {
    @Override
    public void printBar() {
        System.out.println("Bar");
    }

    @Override
    public void printGrill() {
        System.out.println("Grill");

    }
}
