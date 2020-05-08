package com.rainbow.tony.guice.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author tony
 * @copyright rainbow
 * @description DatabasePath
 * @date 2020-05-08
 */
@Documented
@Target({FIELD, METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface DatabasePath {
}
