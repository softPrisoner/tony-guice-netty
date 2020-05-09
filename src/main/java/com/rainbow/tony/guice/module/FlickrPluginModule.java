package com.rainbow.tony.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.*;
import com.rainbow.tony.guice.plugin.FlickrPhotoSummarizer;
import com.rainbow.tony.guice.plugin.UriSummarizer;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description FlickrPluginModule
 * @date 2020-05-09
 */
public class FlickrPluginModule extends AbstractModule {
    @Override
    public void configure() {
        Multibinder<UriSummarizer> uriBinder = Multibinder.newSetBinder(binder(), UriSummarizer.class);
        uriBinder.addBinding().to(FlickrPhotoSummarizer.class);
        // bind plugin dependencies, such as our Flickr API key

        MapBinder<String, UriSummarizer> uriBinder2 =
                MapBinder.newMapBinder(binder(), String.class, UriSummarizer.class);
        uriBinder2.addBinding("Flickr").to(FlickrPhotoSummarizer.class);
        // bind plugin dependencies, such as our Flickr API key
    }

    @ProvidesIntoSet
    UriSummarizer provideFlickerUriSummarizer() {
        return new FlickrPhotoSummarizer();
    }

    @StringMapKey("Flickr")
    @ProvidesIntoMap
    UriSummarizer provideFlickrUriSummarizer() {
        return new FlickrPhotoSummarizer();
    }
}