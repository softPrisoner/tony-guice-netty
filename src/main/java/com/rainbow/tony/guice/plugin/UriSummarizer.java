package com.rainbow.tony.guice.plugin;

import java.net.URI;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description UriSummarizer
 * @date 2020-05-09
 */
public interface UriSummarizer {
    /**
     * Returns a short summary of the URI, or null if this summarizer doesn't
     * know how to summarize the URI.
     *
     * @param uri URI
     * @return String
     */
    String summarize(URI uri);
}