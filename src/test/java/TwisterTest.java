import Person.Customer;
import Rides.Twister;
import org.junit.Before;

public class TwisterTest {

    Twister twister;
    Customer customer;

    @Before
    public void before(){
        customer = new Customer(20, 140.50);
      twister = new Twister("Crazy Twister", 30.00, 15,10);

    }

}
