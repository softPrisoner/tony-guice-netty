package com.rainbow.tony.guice.persist;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

/**
 * MyInitializer
 *
 * @author tony
 * @copyright rainbow
 * @description MyInitializer
 * @date 2020-05-08
 */
public class MyInitializer {
    @Inject
    MyInitializer(PersistService service) {
        service.start();

        // At this point JPA is started and ready.
    }
}