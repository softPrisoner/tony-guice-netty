package com.rainbow.tony.guice.robotproblem;

import com.google.inject.Inject;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Car
 * @date 2020-05-11
 */
class Car {

    private final Engine engine;
    private final Transmission transmission;
    private final Driveline driveline;

    @Inject
    public Car(Engine engine, Transmission transmission, Driveline driveline) {
        this.engine = engine;
        this.transmission = transmission;
        this.driveline = driveline;
        ;
    }

    public Driveline getDriveline() {
        return driveline;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
