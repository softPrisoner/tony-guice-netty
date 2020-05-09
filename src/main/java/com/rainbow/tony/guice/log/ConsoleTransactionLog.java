package com.rainbow.tony.guice.log;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.rainbow.tony.guice.base.ChargeResult;
import com.rainbow.tony.guice.exception.UnreachableException;

import java.util.logging.Logger;

/**
 * ConsoleTransactionLog
 *
 * @author tony
 * @copyright rainbow
 * @description ConsoleTransactionLog
 * @date 2020-05-08
 */
@Singleton
public class ConsoleTransactionLog implements TransactionLog {

    private final Logger logger;

    @Inject
    public ConsoleTransactionLog(Logger logger) {
        this.logger = logger;
    }

    public void logConnectException(UnreachableException e) {
        /* the message is logged to the "ConsoleTransacitonLog" logger */
        logger.warning("Connect exception failed, " + e.getMessage());
    }

    @Override
    public void logChargeResult(ChargeResult result) {

    }

    @Override
    public void logConnectException(Exception e) {

    }
}