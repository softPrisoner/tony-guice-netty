package com.rainbow.tony.guice.service;

import com.rainbow.tony.guice.annotation.NotOnWeekends;
import com.rainbow.tony.guice.base.CreditCard;
import com.rainbow.tony.guice.base.Receipt;
import com.rainbow.tony.guice.order.PizzaOrder;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description RealBillingService
 * @date 2020-05-09
 */
public class RealBillingService implements BillingService {

    @Override
    @NotOnWeekends
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        return null;
    }

    @Override
    public Receipt chargeOrderWithFactory(PizzaOrder order, CreditCard creditCard) {
        return null;
    }

    @Override
    public Receipt chargeOrderWithDI(PizzaOrder order, CreditCard creditCard) {
        return null;
    }


}