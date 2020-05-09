package com.rainbow.tony.guice.base;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description RequestLogger
 * @date 2020-05-09
 */
public interface RequestLogger {

    /**
     * Print the request and response
     *
     * @param request  Request
     * @param response Response
     */
    void logRequest(Request request, Response response);
}
