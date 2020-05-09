package com.rainbow.tony.guice.annotation;

import com.google.inject.multibindings.MapKey;
import com.rainbow.tony.guice.enums.MyCustomEnum;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description MyCustomEnumKey
 * @date 2020-05-09
 */
@MapKey(unwrapValue = true)
@Retention(RUNTIME)
public @interface MyCustomEnumKey {
    MyCustomEnum value();
}