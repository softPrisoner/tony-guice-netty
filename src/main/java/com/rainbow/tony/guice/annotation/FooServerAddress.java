package com.rainbow.tony.guice.annotation;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright FooServerAddress
 * @description Config
 * @date 2020-05-11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@BindingAnnotation
public @interface FooServerAddress {
}