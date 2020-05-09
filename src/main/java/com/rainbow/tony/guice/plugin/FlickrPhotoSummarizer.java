package com.rainbow.tony.guice.plugin;

import com.rainbow.tony.guice.base.Photo;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description FlickrPhotoSummarizer
 * @date 2020-05-09
 */
public class FlickrPhotoSummarizer implements UriSummarizer {
    private final static Map<String, Photo> PHOTO_MAP = new HashMap<>(16);
    private static final Pattern PHOTO_PATTERN = Pattern.compile("http://www.flickr.com/photos/[^/]+/(\\d+)/");

    @Override
    public String summarize(URI uri) {
        Matcher matcher = PHOTO_PATTERN.matcher(uri.toString());
        if (!matcher.matches()) {
            return null;
        } else {
            String id = matcher.group(1);
            Photo photo = lookupPhoto(id);
            return photo.getTitle();
        }
    }

    private Photo addPhoto(Photo photo) {
        return PHOTO_MAP.put(photo.getId(), photo);
    }

    private Photo lookupPhoto(String id) {
        return PHOTO_MAP.get(id);
    }
}