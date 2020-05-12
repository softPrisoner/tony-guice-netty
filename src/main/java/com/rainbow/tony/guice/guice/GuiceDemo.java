package com.rainbow.tony.guice.guice;

import com.google.inject.*;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author tony
 * @copyright rainbow
 * @description GuiceDemo
 * @date 2020-05-08
 */
public class GuiceDemo {

    @Qualifier
    @Retention(RUNTIME)
    @interface Message {

    }

    @Qualifier
    @Retention(RUNTIME)
    @interface Count {

    }

    static class DemoModule extends AbstractModule {

        @Override
        protected void configure() {
            bind(Key.get(String.class, Message.class)).toInstance("hello world");
        }

        @Provides
        @Count
        static Integer provideCount() {
            return 3;
        }
    }

    static class Greeter {
        //message
        private final String message;
        //count
        private final int count;

        // Greeter declares that it needs a string message and an integer
        // representing the number of time the message to be printed.
        // The @Inject annotation marks this constructor as eligible to be used by
        // Guice.
        @Inject
        Greeter(@Message String message, @Count int count) {
            this.message = message;
            this.count = count;
        }

        void sayHello() {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
            }
        }
    }

    public static void main(String[] args) {
        /*
         * Guice.createInjector() takes one or more modules, and returns a new Injector
         * instance. Most applications will call this method exactly once, in their
         * main() method.
         */
        Injector injector = Guice.createInjector(new DemoModule());

        /*
         * Now that we've got the injector, we can build objects.
         */
        Greeter greeter = injector.getInstance(Greeter.class);

        // Prints "hello world" 3 times to the console.
        greeter.sayHello();
    }
}
