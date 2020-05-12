package com.rainbow.tony.guice.web.serlvet;

import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestScoped
class SomeNonServletPojo {
    @Inject
    SomeNonServletPojo(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
    }

}