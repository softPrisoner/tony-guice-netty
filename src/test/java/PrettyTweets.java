import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rainbow.tony.guice.base.Frontend;
import com.rainbow.tony.guice.module.BitlyPluginModule;
import com.rainbow.tony.guice.module.FlickrPluginModule;
import com.rainbow.tony.guice.module.GoogleMapsPluginModule;

public class PrettyTweets {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector(
                new GoogleMapsPluginModule(),
                new BitlyPluginModule(),
                new FlickrPluginModule()
        );

        injector.getInstance(Frontend.class).start();
    }
}