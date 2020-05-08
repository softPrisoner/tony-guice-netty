package com.rainbow.tony.guice.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.rainbow.tony.guice.annotation.PayPal;
import com.rainbow.tony.guice.base.ChargeResult;
import com.rainbow.tony.guice.base.CreditCard;
import com.rainbow.tony.guice.base.Receipt;
import com.rainbow.tony.guice.exception.UnreachableException;
import com.rainbow.tony.guice.factory.CreditCardProcessorFactory;
import com.rainbow.tony.guice.factory.TransactionLogFactory;
import com.rainbow.tony.guice.log.DatabaseTransactionLog;
import com.rainbow.tony.guice.log.TransactionLog;
import com.rainbow.tony.guice.order.PizzaOrder;
import com.rainbow.tony.guice.processor.CreditCardProcessor;
import com.rainbow.tony.guice.processor.PaypalCreditCardProcessor;

/**
 * RealBillingServiceImpl
 *
 * @author tony
 * @copyright rainbow
 * @description RealBillingServiceImpl
 * @date 2020-05-08
 */
public class RealBillingServiceGuiceImpl implements BillingService {

    private final CreditCardProcessor processor;

    private final TransactionLog transactionLog;

    public RealBillingServiceGuiceImpl() {

        processor = null;
        transactionLog = null;
    }

    /**
     * @param processor      CreditCardProcessor
     * @param transactionLog TransactionLog
     * @Named describe the bean name not a class type.
     * @PayPal describe the bean by the manual annotation.
     */
    @Inject
    public RealBillingServiceGuiceImpl(@PayPal @Named("Checkout") CreditCardProcessor processor, TransactionLog transactionLog) {
        //dependency inject
        this.transactionLog = transactionLog;
        this.processor = processor;
    }

    /**
     * Create object directly without any decoration.
     *
     * @param order      order
     * @param creditCard credit card
     * @return Receipt
     */
    @Override
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        //credit card processor
        CreditCardProcessor processor = new PaypalCreditCardProcessor();
        //transaction log
        TransactionLog transactionLog = new DatabaseTransactionLog();

        try {
            ChargeResult result = processor.charge(creditCard, order.getAmount());
            transactionLog.logChargeResult(result);

            return result.wasSuccessful()
                    ? Receipt.forSuccessfulCharge(order.getAmount())
                    : Receipt.forDeclinedCharge(result.getDeclineMessage());
        } catch (UnreachableException e) {
            transactionLog.logConnectException(e);
            return Receipt.forSystemFailure(e.getMessage());
        }


    }

    /**
     * Create object with characteristic factory
     *
     * @param order      order
     * @param creditCard credit card
     * @return Receipt
     */
    @Override
    public Receipt chargeOrderWithFactory(PizzaOrder order, CreditCard creditCard) {
        //factory
        CreditCardProcessor processor = CreditCardProcessorFactory.getInstance();
        TransactionLog transactionLog = TransactionLogFactory.getInstance();

        try {
            ChargeResult result = processor.charge(creditCard, order.getAmount());
            transactionLog.logChargeResult(result);

            return result.wasSuccessful()
                    ? Receipt.forSuccessfulCharge(order.getAmount())
                    : Receipt.forDeclinedCharge(result.getDeclineMessage());
        } catch (UnreachableException e) {
            transactionLog.logConnectException(e);
            return Receipt.forSystemFailure(e.getMessage());
        }
    }

    /**
     * Create object with characteristic factory
     *
     * @param order      order
     * @param creditCard credit card
     * @return Receipt
     */
    @Override
    public Receipt chargeOrderWithDI(PizzaOrder order, CreditCard creditCard) {
        try {
            ChargeResult result = processor.charge(creditCard, order.getAmount());
            transactionLog.logChargeResult(result);

            return result.wasSuccessful()
                    ? Receipt.forSuccessfulCharge(order.getAmount())
                    : Receipt.forDeclinedCharge(result.getDeclineMessage());
        } catch (UnreachableException e) {
            transactionLog.logConnectException(e);
            return Receipt.forSystemFailure(e.getMessage());
        }
    }
}