package com.rainbow.tony.guice.log;

/**
 * @author tony
 * @copyright rainbow
 * @description MySqlDatabaseTransactionLog
 * @date 2020-05-08
 */
public class MySqlDatabaseTransactionLog extends DatabaseTransactionLog {
    @Override
    public void logConnectException(Exception e) {
        System.out.println("[MYSQL]" + e.getMessage());
    }
}
