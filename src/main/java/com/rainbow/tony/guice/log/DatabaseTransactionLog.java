package com.rainbow.tony.guice.log;

import com.rainbow.tony.guice.base.ChargeResult;

import java.sql.Connection;

/**
 * DatabaseTransactionLog
 *
 * @author tony
 * @copyright rainbow
 * @description DatabaseTransactionLog
 * @date 2020-05-08
 */
public class DatabaseTransactionLog implements TransactionLog {

    private Connection connection;

    public DatabaseTransactionLog() {
    }

    public DatabaseTransactionLog(Connection connection) {
        this.connection = connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void logChargeResult(ChargeResult result) {

    }

    @Override
    public void logConnectException(Exception e) {
        System.out.println(e.getMessage());
    }

}
