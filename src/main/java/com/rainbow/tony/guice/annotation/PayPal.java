package com.rainbow.tony.guice.annotation;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author tony
 * @copyright rainbow
 * @description PayPal
 * @date 2020-05-08
 */
@Documented
@Target({FIELD, METHOD, PARAMETER})
@Retention(RUNTIME)
@Qualifier
public @interface PayPal {
}
