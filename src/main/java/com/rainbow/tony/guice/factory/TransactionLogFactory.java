package com.rainbow.tony.guice.factory;

import com.rainbow.tony.guice.log.DatabaseTransactionLog;
import com.rainbow.tony.guice.log.TransactionLog;

/**
 * TransactionLogFactory
 *
 * @author tony
 * @copyright rainbow
 * @description TransactionLogFactory
 * @date 2020-05-08
 */
public class TransactionLogFactory {

    private static TransactionLog instance;

    public static void setInstance(TransactionLog logger) {
        instance = logger;
    }

    public static TransactionLog getInstance() {
        //Singleton Object
        if (instance == null) {
            return new DatabaseTransactionLog();
        }

        return instance;
    }
}