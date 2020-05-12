package com.rainbow.tony.guice.web.module;

import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.servlet.*;
import com.google.inject.spi.DefaultBindingTargetVisitor;
import com.rainbow.tony.guice.web.Fave;
import com.rainbow.tony.guice.web.serlvet.MyAjaxServlet;
import com.rainbow.tony.guice.web.serlvet.TonyServlet;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description YourServletModule
 * @date 2020-05-11
 */
public class YourServletModule extends ServletModule {
    @Override
    protected void configureServlets() {
        //Regex test
        serveRegex("(.)*ajax(.)*").with(MyAjaxServlet.class);
        filter("/process-user*").through(createUserIdScopingFilter());

        //Map
        Map<String, String> params = new HashMap<String, String>(16);
        params.put("coffee", "Espresso");
        params.put("site", "google.com");

        //serve
        serve("/*").with(TonyServlet.class, params);
        filter("/*").through(Key.get(Filter.class, Fave.class));

        //self servlet
        serve("/myurl").with(TonyServlet.class);

    }

    @Provides
    @Named("user-id")
    @RequestScoped
    Integer provideUserId() {
        throw new IllegalStateException("user id must be manually seeded");
    }

    Filter createUserIdScopingFilter() {
        return null;
    }

    boolean isBindingForUri(Binding<?> binding, String uri) {
        return binding.acceptTargetVisitor(new Visitor(uri));
    }

    private static class Visitor extends DefaultBindingTargetVisitor<Object, Boolean>
            implements ServletModuleTargetVisitor<Object, Boolean> {
        private final String uri;

        Visitor(String uri) {
            this.uri = uri;
        }

        @Override
        public Boolean visitOther(Binding<?> binding) {
            return false;
        }

        @Override
        public Boolean visit(InstanceFilterBinding binding) {
            return matchesUri(binding);
        }

        @Override
        public Boolean visit(InstanceServletBinding binding) {
            return matchesUri(binding);
        }

        @Override
        public Boolean visit(LinkedFilterBinding binding) {
            return matchesUri(binding);
        }

        @Override
        public Boolean visit(LinkedServletBinding binding) {
            return matchesUri(binding);
        }

        private boolean matchesUri(ServletModuleBinding binding) {
            return binding.matchesUri(uri);
        }
    }
}