package com.rainbow.tony.guice.log;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.rainbow.tony.guice.base.ChargeResult;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description LogFileTransactionLog
 * @date 2020-05-09
 */
public class LogFileTransactionLog implements TransactionLog {

    private final Provider<LogFileEntry> logFileProvider;

    @Inject
    public LogFileTransactionLog(Provider<LogFileEntry> logFileProvider) {
        this.logFileProvider = logFileProvider;
    }

    @Override
    public void logChargeResult(ChargeResult result) {
        LogFileEntry summaryEntry = logFileProvider.get();
        summaryEntry.setText("Charge " + (result.wasSuccessful() ? "success" : "failure"));
        summaryEntry.save();

        if (!result.wasSuccessful()) {
            LogFileEntry detailEntry = logFileProvider.get();
            detailEntry.setText("Failure result: " + result);
            detailEntry.save();
        }
    }

    @Override
    public void logConnectException(Exception e) {

    }
}