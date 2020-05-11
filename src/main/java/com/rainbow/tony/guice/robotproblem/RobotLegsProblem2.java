package com.rainbow.tony.guice.robotproblem;

import com.google.inject.*;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description RobotLegsProblem2
 * @date 2020-05-11
 */
public class RobotLegsProblem2 {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                // global stuff
                // same to all
                bind(Driveline.class).to(FrontWheelDrive.class);
                bind(Engine.class).to(DieselEngine.class);
            }
        }, new PrivateModule() {
            @Override
            protected void configure() {
                // private Module is different story
                // Bind car annotated with blue and expose it
                bind(Car.class).annotatedWith(Blue.class).to(Car.class);
                expose(Car.class).annotatedWith(Blue.class);

                // What we bind in here only applies to the exposed stuff
                // i.e. the exposed car from this module will get this injected
                // where stuff in regular module (Engine,Driveline) is "inherited" - it is global
                bind(Transmission.class).to(AutomaticTransmission.class);
            }
        }, new PrivateModule() {
            @Override
            protected void configure() {
                bind(Car.class).annotatedWith(Red.class).to(Car.class);
                expose(Car.class).annotatedWith(Red.class);

                bind(Transmission.class).to(ManualTransmission.class);
               /*
                 The point is that you cannot do this with regular module i.e.
                 bind(Car.class).annotatedWith(Blue.class).to(Car.class);
                 bind(Car.class).annotatedWith(Red.class).to(Car.class);
                 now notice the dilemma
                 class Car{
                 @Inject Transmission transmission;
                 You cannot solve this by
                 @Inject @Blue @Red Transmission transmission;
                 or
                 bind(Transmission.class).to(AutomaticTransmission.class).ifParentAnnotatedWith(Blue.class)
                 bind(Transmission.class).to(ManualTransmission.class).ifParentAnnotatedWith(Red.class)
                 but with private modules you can get this functionality
                 */
            }
        });

        Car blueCar = injector.getInstance(Key.get(Car.class, Blue.class));
        System.out.println("Blue car transmission: " + blueCar.getTransmission());

        Car redCar = injector.getInstance(Key.get(Car.class, Red.class));
        System.out.println("Red car transmission: " + redCar.getTransmission());

    }


}
