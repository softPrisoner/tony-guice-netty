package com.rainbow.tony.guice.persist.service;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description MyService
 * @date 2020-05-11
 */
public class MyService {
    @Inject
    private EntityManager em;

    @Transactional(rollbackOn = IOException.class, ignore = FileNotFoundException.class)
    public void createNewPerson() {
        em.persist(new Person(new Object()));
    }

}