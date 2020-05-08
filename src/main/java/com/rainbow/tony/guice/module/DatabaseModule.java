package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.rainbow.tony.guice.log.DatabaseTransactionLog;
import com.rainbow.tony.guice.log.MySqlDatabaseTransactionLog;
import com.rainbow.tony.guice.log.TransactionLog;

/**
 * @author tony
 * @copyright rainbow
 * @description DatabaseModule
 * @date 2020-05-08
 */
public class DatabaseModule extends AbstractModule {
    @Override
    protected void configure() {
//        Linked Bindings
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
//      bind(DatabaseTransactionLog.class).to(MySqlDatabaseTransactionLog.class);
    }

    /**
     * bind(DatabaseTransactionLog.class).to(MySqlDatabaseTransactionLog.class);
     *
     * @return DatabaseTransactionLog
     */
    @Provides
    @Singleton
    public DatabaseTransactionLog provideDataBase() {
        return new MySqlDatabaseTransactionLog();
    }
}
