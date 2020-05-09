package com.rainbow.tony.guice.service;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.rainbow.tony.guice.base.CreditCard;
import com.rainbow.tony.guice.base.Receipt;
import com.rainbow.tony.guice.log.TransactionLog;
import com.rainbow.tony.guice.order.PizzaOrder;
import com.rainbow.tony.guice.processor.CreditCardProcessor;

/**
 * RealBillingService
 *
 * @author tony
 * @copyright rainbow
 * @description RealBillingService
 * @date 2020-05-08
 */
public class RealBillingService3Impl implements BillingService {
    private final Provider<CreditCardProcessor> processorProvider;
    private final Provider<TransactionLog> transactionLogProvider;

    @Inject
    public RealBillingService3Impl(Provider<CreditCardProcessor> processorProvider,
                                   Provider<TransactionLog> transactionLogProvider) {
        this.processorProvider = processorProvider;
        this.transactionLogProvider = transactionLogProvider;
    }

    @Override
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        CreditCardProcessor processor = processorProvider.get();
        TransactionLog transactionLog = transactionLogProvider.get();

        /* use the processor and transaction log here */
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