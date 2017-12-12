package Rides;

import Person.Customer;

public class Boomerang  extends Ride{
    public Boomerang(String name, double price, int minAge, int capacity) {
        super(name, price, minAge, capacity);
    }


    public String canStart() {
        return "Ride starts";
    }


    public void checkin(Customer customer2) {

    }
}
