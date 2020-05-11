package com.rainbow.tony.guice.module;

import com.google.common.io.CharSink;
import com.google.common.io.Files;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.io.File;
import java.nio.charset.StandardCharsets;

/**
 * @author tony
 * @copyright rainbow
 * @description MyModule
 * @date 2020-05-08
 */
class MyModule extends AbstractModule {
    @Provides
    public CharSink provideCharSink() {
        return Files.asCharSink(new File("/tmp/outfile"), StandardCharsets.UTF_8);
    }

    @Override
    protected void configure() {

    }
}
