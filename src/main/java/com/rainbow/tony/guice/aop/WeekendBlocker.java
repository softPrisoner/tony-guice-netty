package com.rainbow.tony.guice.aop;

import com.google.inject.Provider;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Calendar;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.LONG;
import static java.util.Locale.ENGLISH;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description WeekendBlocker
 * @date 2020-05-09
 */
public class WeekendBlocker implements MethodInterceptor {
    private Provider<Calendar> provider;

    public WeekendBlocker() {

    }

    public WeekendBlocker(Provider<Calendar> provider) {
        this.provider = provider;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
//        Calendar today = new GregorianCalendar();
        Calendar today = provider.get();
        if (today.getDisplayName(DAY_OF_WEEK, LONG, ENGLISH).startsWith("S")) {
            throw new IllegalStateException(invocation.getMethod().getName() + " not allowed on weekends!");
        }

        return invocation.proceed();
    }
}