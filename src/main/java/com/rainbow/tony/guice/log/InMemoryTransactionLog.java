package com.rainbow.tony.guice.log;

import com.rainbow.tony.guice.base.ChargeResult;

/**
 * @author tony
 * @copyright rainbow
 * @description InMemoryTransactionLog
 * @date 2020-05-08
 */
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
