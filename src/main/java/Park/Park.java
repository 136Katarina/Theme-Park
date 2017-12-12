package Park;

import Person.Customer;
import Rides.Boomerang;
import Rides.Twister;

public class Park {
    private String name;
    private Boomerang boomerang;
    private Twister twister;
    private Customer customer;
    private int capacity;

    public Park(String name, Boomerang boomerang, Twister twister, Customer customer, int capacity){
        this.name = name;
        this.boomerang = boomerang;
        this.twister = twister;
        this.customer = customer;
        this.capacity = capacity;
    }
}
