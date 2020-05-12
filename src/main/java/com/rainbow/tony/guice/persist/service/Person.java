package com.rainbow.tony.guice.persist.service;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Person
 * @date 2020-05-11
 */
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(Object o) {

    }
}
