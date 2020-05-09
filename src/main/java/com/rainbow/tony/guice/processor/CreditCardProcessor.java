package com.rainbow.tony.guice.processor;

import com.google.inject.ImplementedBy;
import com.rainbow.tony.guice.base.ChargeResult;
import com.rainbow.tony.guice.base.CreditCard;

/**
 * CreditCardProcessor
 *
 * @author tony
 * @copyright rainbow
 * @description @ImplementBy is annotation to support that the explicit interface to the bean.
 * If a type is in both a bind() statement (as the first argument) and
 * has the @ImplementedBy annotation, the bind() statement is used.
 * Use @ImplementedBy carefully; it adds a compile-time dependency from the interface to its implementation.
 * @date 2020-05-08
 */
@ImplementedBy(SquareCreditCardProcessor.class)
public interface CreditCardProcessor {
    /**
     * Charge credit
     *
     * @param creditCard credit card
     * @param amount     amount
     * @return ChargeResult
     */
    ChargeResult charge(CreditCard creditCard, Integer amount);


}
