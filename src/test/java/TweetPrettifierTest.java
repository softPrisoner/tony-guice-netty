import com.google.inject.Inject;
import com.rainbow.tony.guice.base.EmoticonImagifier;
import com.rainbow.tony.guice.base.Html;
import com.rainbow.tony.guice.plugin.UriSummarizer;

import java.net.URI;
import java.util.Map;
import java.util.Set;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description TweetPrettifierTest
 * @date 2020-05-09
 */
public class TweetPrettifierTest {
    private final Set<UriSummarizer> summarizers;

    private final EmoticonImagifier emoticonImagifier;

    private final Map<String, UriSummarizer> summarizersMap;

    @Inject
    TweetPrettifierTest(Set<UriSummarizer> summarizers,
                        EmoticonImagifier emoticonImagifier, Map<String, UriSummarizer> summarizersMap) {
        this.summarizers = summarizers;
        this.emoticonImagifier = emoticonImagifier;
        this.summarizersMap = summarizersMap;
    }

    public Html prettifyTweet(String tweetMessage) {
        // split out the URIs and call prettifyUri() for each
        return null;
    }

    public String prettifyUri(URI uri) {
        // loop through the implementations, looking for one that supports this URI
        for (UriSummarizer summarizer : summarizers) {
            String summary = summarizer.summarize(uri);
            if (summary != null) {
                return summary;
            }
        }

        // no summarizer found, just return the URI itself
        return uri.toString();
    }
}