package com.rainbow.tony.guice.service;

import com.rainbow.tony.guice.base.CreditCard;
import com.rainbow.tony.guice.base.Receipt;
import com.rainbow.tony.guice.order.PizzaOrder;

/**
 * BillingService
 *
 * @author tony
 * @copyright rainbow
 * @description BillingService
 * @date 2020-05-08
 */
public interface BillingService {
    /**
     * Charge order
     *
     * @param order      order
     * @param creditCard credit card
     * @return Receipt
     */
    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);

    /**
     * Charge order chargeOrderWithFactory
     *
     * @param order      order
     * @param creditCard credit card
     * @return Receipt
     */
    Receipt chargeOrderWithFactory(PizzaOrder order, CreditCard creditCard);

    /**
     * chargeOrderWithDI
     *
     * @param order      order
     * @param creditCard credit card
     * @return Receipt
     */
    Receipt chargeOrderWithDI(PizzaOrder order, CreditCard creditCard);

}
