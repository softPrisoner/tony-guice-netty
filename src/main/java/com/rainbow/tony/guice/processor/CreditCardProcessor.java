package com.rainbow.tony.guice.processor;

import com.rainbow.tony.guice.base.ChargeResult;
import com.rainbow.tony.guice.base.CreditCard;

/**
 * CreditCardProcessor
 *
 * @author tony
 * @copyright rainbow
 * @description CreditCardProcessor
 * @date 2020-05-08
 */
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
