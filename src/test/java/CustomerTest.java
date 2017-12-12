import Person.Customer;
import Rides.Boomerang;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Customer customer2;
    Boomerang boomerang;

    @Before
    public void before(){
        customer1 = new Customer(20,130.00);
        customer2 = new Customer(12, 10);
        boomerang = new Boomerang("Name", 20.00, 5, 40);
    }

    @Test
    public void canAfford(){
        assertEquals(true, customer1.canAfford(boomerang));
    }


    @Test
    public void canTakeRide(){
        assertEquals(true, customer2.isOldEnough(boomerang));
    }


}
