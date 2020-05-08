import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rainbow.tony.guice.log.TransactionLog;
import com.rainbow.tony.guice.module.BillingModule;
import com.rainbow.tony.guice.module.DatabaseModule;
import org.junit.Test;

/**
 * @author tony
 * @copyright rainbow
 * @description BindingsTest
 * @date 2020-05-08
 */
public class BindingsTest {
    @Test
    public void test() {
        Injector injector = Guice.createInjector(new DatabaseModule());
        TransactionLog instance = injector.getInstance(TransactionLog.class);

        instance.logConnectException(new RuntimeException("Database has occurred some error."));
    }

    @Test
    public void constructorTest() {
        Injector injector = Guice.createInjector(new BillingModule());
        TransactionLog instance = injector.getInstance(TransactionLog.class);
        instance.logConnectException(new RuntimeException("Database has occurred some error."));
    }
}
