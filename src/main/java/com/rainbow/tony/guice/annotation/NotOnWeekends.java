package com.rainbow.tony.guice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description NotOnWeekends
 * @date 2020-05-09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NotOnWeekends {
}