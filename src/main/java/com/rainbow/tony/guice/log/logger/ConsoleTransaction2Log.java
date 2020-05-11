package com.rainbow.tony.guice.log.logger;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.rainbow.tony.guice.base.ChargeResult;
import com.rainbow.tony.guice.base.User;
import com.rainbow.tony.guice.exception.UnreachableException;
import com.rainbow.tony.guice.log.TransactionLog;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description ConsoleTransaction2Log
 * @date 2020-05-09
 */
@Singleton
public class ConsoleTransaction2Log implements TransactionLog {

    private final AtomicInteger failureCount = new AtomicInteger();
    private final Provider<User> userProvider;

    @Inject
    public ConsoleTransaction2Log(Provider<User> userProvider) {
        this.userProvider = userProvider;
    }

    public void logConnectException(UnreachableException e) {
        failureCount.incrementAndGet();
        User user = userProvider.get();
        System.out.println("Connection failed for " + user + ": " + e.getMessage());
        System.out.println("Failure count: " + failureCount.incrementAndGet());
    }

    @Override
    public void logChargeResult(ChargeResult result) {

    }

    @Override
    public void logConnectException(Exception e) {

    }
}