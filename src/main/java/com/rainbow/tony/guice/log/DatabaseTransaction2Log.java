package com.rainbow.tony.guice.log;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.rainbow.tony.guice.base.ChargeResult;

import java.sql.Connection;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description DatabaseTransaction2Log
 * @date 2020-05-09
 */
public class DatabaseTransaction2Log implements TransactionLog {

    private final Provider<Connection> connectionProvider;

    @Inject
    public DatabaseTransaction2Log(Provider<Connection> connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    @Override
    public void logChargeResult(ChargeResult result) {
        /* only write failed charges to the database */
        if (!result.wasSuccessful()) {
            Connection connection = connectionProvider.get();
        }
    }

    @Override
    public void logConnectException(Exception e) {

    }
}