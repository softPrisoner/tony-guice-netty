package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.rainbow.tony.guice.log.InMemoryTransactionLog;
import com.rainbow.tony.guice.log.TransactionLog;

/**
 * @author tony
 * @copyright rainbow
 * @description MemoryTransactionModule
 * @date 2020-05-08
 */
public class MemoryTransactionModule extends AbstractModule {
    @Override
    protected void configure() {
        //Support  Transaction
        bind(TransactionLog.class).to(InMemoryTransactionLog.class).in(Singleton.class);
    }

    @Provides
    @Singleton
    TransactionLog provideTransactionLog() {
        return new InMemoryTransactionLog();
    }
}
