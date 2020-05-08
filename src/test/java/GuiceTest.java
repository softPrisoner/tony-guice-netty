import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rainbow.tony.guice.module.BillingModule;
import com.rainbow.tony.guice.service.BillingService;

/**
 * @author tony
 * @copyright rainbow
 * @description GuiceTest
 * @date 2020-05-08
 */
public class GuiceTest {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);
        System.out.println(billingService);
    }
}
