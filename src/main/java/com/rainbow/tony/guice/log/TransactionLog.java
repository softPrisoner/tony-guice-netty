package com.rainbow.tony.guice.log;

import com.rainbow.tony.guice.base.ChargeResult;

/**
 * TransactionLog
 *
 * @author tony
 * @copyright rainbow
 * @description TransactionLog
 * @date 2020-05-08
 */
public interface TransactionLog {
    /**
     * Print Log
     *
     * @param result ChargeResult
     */
    void logChargeResult(ChargeResult result);

    /**
     * Print Exception
     *
     * @param e exception
     */
    void logConnectException(Exception e);



}
