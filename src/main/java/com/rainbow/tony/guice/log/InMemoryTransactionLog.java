package com.rainbow.tony.guice.log;

import com.google.inject.Singleton;
import com.rainbow.tony.guice.base.ChargeResult;

/**
 * @author tony
 * @copyright rainbow
 * @description InMemoryTransactionLog
 * @date 2020-05-08
 */
@Singleton
public class InMemoryTransactionLog implements TransactionLog {

    private boolean wasSuccessLogged;

    @Override
    public void logChargeResult(ChargeResult result) {

    }

    @Override
    public void logConnectException(Exception e) {

    }

    public boolean wasSuccessLogged() {
        return wasSuccessLogged;
    }
}
