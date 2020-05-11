package com.rainbow.tony.guice.robotproblem;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Red
 * @date 2020-05-11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD, PARAMETER, METHOD})
@BindingAnnotation
@interface Red {
}