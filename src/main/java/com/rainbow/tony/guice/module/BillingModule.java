package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import com.rainbow.tony.guice.annotation.PayPal;
import com.rainbow.tony.guice.connection.MysqlConnection;
import com.rainbow.tony.guice.log.DatabaseTransactionLog;
import com.rainbow.tony.guice.log.TransactionLog;
import com.rainbow.tony.guice.processor.CreditCardProcessor;
import com.rainbow.tony.guice.processor.PaypalCreditCardProcessor;
import com.rainbow.tony.guice.service.BillingService;
import com.rainbow.tony.guice.service.RealBillingServiceGuiceImpl;

import java.sql.Connection;

/**
 * @author tony
 * @copyright rainbow
 * @description BillingModule
 * @date 2020-05-08
 */
public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        //Repeat code with the singleton
//        bind(TransactionLog.class).to(DatabaseTransactionLog.class);

        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
        // The bean decorated with PayPal.class
        bind(CreditCardProcessor.class).annotatedWith(PayPal.class).to(PaypalCreditCardProcessor.class);
        //The bean decorated with @Name
        bind(CreditCardProcessor.class).annotatedWith(Names.named("Checkout")).to(PaypalCreditCardProcessor.class);

        bind(Connection.class).to(MysqlConnection.class).in(Singleton.class);
        /*
        Inject with guice
         */
        bind(BillingService.class).to(RealBillingServiceGuiceImpl.class);

        /*
        Support provider
         */
//        bind(TransactionLog.class).toProvider(DatabaseTransactionLogProvider.class);


        try {
            bind(TransactionLog.class).toConstructor(DatabaseTransactionLog.class.getConstructor(Connection.class));
        } catch (NoSuchMethodException e) {
            addError(e);
        }
    }
}
