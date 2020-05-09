package com.rainbow.tony.guice.log;

import com.google.inject.ProvidedBy;
import com.rainbow.tony.guice.base.ChargeResult;
import com.rainbow.tony.guice.provider.DatabaseTransactionLogProvider;

/**
 * Like @ProvidedBy, if the type is annotated and used in a bind() statement,
 * the bind() statement will be used.
 *
 * @author tony
 * @copyright rainbow
 * @description TransactionLog
 * @date 2020-05-08
 */
@ProvidedBy(DatabaseTransactionLogProvider.class)
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
