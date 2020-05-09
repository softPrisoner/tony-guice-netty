package com.rainbow.tony.guice.log.logger;

import com.rainbow.tony.guice.base.Request;
import com.rainbow.tony.guice.base.Response;

import java.io.PrintStream;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description ConsoleLogger
 * @date 2020-05-09
 */
public class ConsoleLogger implements RequestLogger {
    private final PrintStream printStream;

    public ConsoleLogger(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void logRequest(Request request, Response response) {
        printStream.println(request);
        printStream.println(response);
    }
}
