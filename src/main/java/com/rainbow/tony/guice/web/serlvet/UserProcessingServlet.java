package com.rainbow.tony.guice.web.serlvet;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description UserProcessingServlet
 * @date 2020-05-11
 */
@Singleton
class UserProcessingServlet extends HttpServlet {

    private final Provider<Integer> userIdProvider;

    @Inject
    UserProcessingServlet(@Named("user-id") Provider<Integer> userIdProvider) {
        this.userIdProvider = userIdProvider;
    }

    @Override
    public void doGet(
            HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Integer userId = userIdProvider.get();
    }
}