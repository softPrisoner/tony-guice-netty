package com.rainbow.tony.guice.handler;

import com.google.inject.Inject;
import com.rainbow.tony.guice.base.Request;
import com.rainbow.tony.guice.base.RequestLogger;
import com.rainbow.tony.guice.base.Response;

import java.util.Optional;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description RequestHandler
 * @date 2020-05-09
 */
public class RequestHandler {
    private final Optional<RequestLogger> requestLogger;

    @Inject
    RequestHandler(Optional<RequestLogger> requestLogger) {
        this.requestLogger = requestLogger;
    }

    void handleRequest(Request request) {
        Response response = null;

        if (requestLogger.isPresent()) {
            requestLogger.get().logRequest(request, response);
        }
    }
}