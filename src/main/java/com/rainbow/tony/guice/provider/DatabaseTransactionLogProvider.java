package com.rainbow.tony.guice.provider;

import com.google.inject.Inject;
import com.rainbow.tony.guice.log.DatabaseTransactionLog;
import com.rainbow.tony.guice.log.TransactionLog;

import java.sql.Connection;

/**
 * @author tony
 * @copyright rainbow
 * @description DatabaseTransactionLogProvider
 * @date 2020-05-08
 */
public class DatabaseTransactionLogProvider implements com.google.inject.Provider<TransactionLog> {
    private final Connection connection;

    @Inject
    public DatabaseTransactionLogProvider(Connection connection) {
        this.connection = connection;
    }

    @Override
    public TransactionLog get() {
        DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();
        transactionLog.setConnection(connection);
        return transactionLog;
    }
}