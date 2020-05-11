package com.rainbow.tony.guice.closableresource;

import com.google.inject.Inject;
import com.rainbow.tony.guice.annotation.Config;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description ResourceManager
 * @date 2020-05-11
 */
class ResourceManager {
    @Inject
    ResourceManager(@Config String configs) {
    }

    /**
     * Returns a new thing for you to use and dispose of
     */
    OutputStream provideInstance() throws FileNotFoundException {
        return new FileOutputStream("");
    }
}
