package com.rainbow.tony.guice.processor;

import com.rainbow.tony.guice.base.ChargeResult;
import com.rainbow.tony.guice.base.CreditCard;

/**
 * @author tony
 * @copyright rainbow
 * @description SquareCreditCardProcessor
 * @date 2020-05-08
 */
public class SquareCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, Integer amount) {
        return null;
    }
}
