package com.rainbow.tony.guice.factory;

import com.google.inject.Inject;
import com.rainbow.tony.guice.processor.CreditCardProcessor;
import com.rainbow.tony.guice.processor.SquareCreditCardProcessor;

/**
 * CreditCardProcessorFactory
 *
 * @author tony
 * @copyright rainbow
 * @description CreditCardProcessorFactory
 * @date 2020-05-08
 */
public class CreditCardProcessorFactory {
    @Inject(optional = true)
    private static CreditCardProcessor instance;

    public static void setInstance(CreditCardProcessor processor) {
        instance = processor;
    }

    public static CreditCardProcessor getInstance() {
        //Singleton Object
        if (instance == null) {
            return new SquareCreditCardProcessor();
        }

        return instance;
    }
}