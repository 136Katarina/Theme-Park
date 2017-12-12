import Person.Customer;
import Rides.Boomerang;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoomerangTest {

    Boomerang boomerang;
    Customer customer1;
    Customer customer2;

    @Before
    public void before(){
        boomerang = new Boomerang("Wild Boomerang", 20.00, 12, 15);
        customer1 = new Customer(12, 50.00);
        customer2 = new Customer(20, 140.50);
    }

    @Test
    public void canStartRide(){
        assertEquals("Ride starts", boomerang.canStart());
    }
}
