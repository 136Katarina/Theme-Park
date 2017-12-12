import Person.Customer;
import Rides.Boomerang;
import Rides.Ride;
import Rides.Twister;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class RideTest {
    Boomerang boomerang;
    Twister twister;
    Customer customer1;
    Customer customer2;
    Ride ride;



    @Before
    public void before(){
        boomerang = new Boomerang("Wild Boomerang", 20.00, 12, 15);
        twister = new Twister("Crazy Twister", 30.00, 15,10);
        customer1 = new Customer(20, 140.50);
        customer2 = new Customer(10, 30.00);

    }

    @Test
    public void canAddCustomer(){
        boomerang.add(customer2);
        assertEquals(2, ride.queue(customer2));
    }

}
