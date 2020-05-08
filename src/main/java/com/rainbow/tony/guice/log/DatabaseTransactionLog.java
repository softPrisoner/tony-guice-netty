package com.rainbow.tony.guice.log;

import com.rainbow.tony.guice.base.ChargeResult;

/**
 * DatabaseTransactionLog
 *
 * @author tony
 * @copyright rainbow
 * @description DatabaseTransactionLog
 * @date 2020-05-08
 */
public class DatabaseTransactionLog implements TransactionLog {
    @Override
    public void logChargeResult(ChargeResult result) {

    }

    @Override
    public void logConnectException(Exception e) {

    }
}
