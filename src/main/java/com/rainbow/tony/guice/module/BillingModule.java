package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.rainbow.tony.guice.log.DatabaseTransactionLog;
import com.rainbow.tony.guice.log.TransactionLog;
import com.rainbow.tony.guice.processor.CreditCardProcessor;
import com.rainbow.tony.guice.processor.PaypalCreditCardProcessor;
import com.rainbow.tony.guice.service.BillingService;
import com.rainbow.tony.guice.service.RealBillingServiceGuiceImpl;

/**
 * @author tony
 * @copyright rainbow
 * @description BillingModule
 * @date 2020-05-08
 */
public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
        //Inject with guice
        bind(BillingService.class).to(RealBillingServiceGuiceImpl.class);
    }
}
