import com.rainbow.tony.guice.base.CreditCard;
import com.rainbow.tony.guice.base.Receipt;
import com.rainbow.tony.guice.factory.CreditCardProcessorFactory;
import com.rainbow.tony.guice.factory.TransactionLogFactory;
import com.rainbow.tony.guice.log.InMemoryTransactionLog;
import com.rainbow.tony.guice.order.PizzaOrder;
import com.rainbow.tony.guice.processor.FakeCreditCardProcessor;
import com.rainbow.tony.guice.service.RealBillingServiceImpl;
import junit.framework.TestCase;

public class RealBillingServiceTest extends TestCase {

    private final PizzaOrder order = new PizzaOrder(100);
    private final CreditCard creditCard = new CreditCard("1234", 11, 2010);

    private final InMemoryTransactionLog transactionLog = new InMemoryTransactionLog();
    private final FakeCreditCardProcessor processor = new FakeCreditCardProcessor();

    @Override
    public void setUp() {
        TransactionLogFactory.setInstance(transactionLog);
        CreditCardProcessorFactory.setInstance(processor);
    }

    @Override
    public void tearDown() {
        TransactionLogFactory.setInstance(null);
        CreditCardProcessorFactory.setInstance(null);
    }

    public void testSuccessfulCharge() {
        RealBillingServiceImpl billingService = new RealBillingServiceImpl();
        Receipt receipt = billingService.chargeOrder(order, creditCard);

        assertTrue(receipt.hasSuccessfulCharge());
        assertEquals(100, receipt.getAmountOfCharge());
        assertEquals(creditCard, processor.getCardOfOnlyCharge());
        assertEquals(100, processor.getAmountOfOnlyCharge());
        assertTrue(transactionLog.wasSuccessLogged());
    }

    public void testSuccessfulCharge2() {
        RealBillingServiceImpl billingService
                = new RealBillingServiceImpl(processor, transactionLog);
        Receipt receipt = billingService.chargeOrder(order, creditCard);

        assertTrue(receipt.hasSuccessfulCharge());
        assertEquals(100, receipt.getAmountOfCharge());
        assertEquals(creditCard, processor.getCardOfOnlyCharge());
        assertEquals(100, processor.getAmountOfOnlyCharge());
        assertTrue(transactionLog.wasSuccessLogged());
    }
}