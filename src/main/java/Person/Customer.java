package Person;

import Rides.Boomerang;
import Rides.Ride;

public class Customer extends Person {


    public Customer(int age, double wallet) {
        super(age, wallet);
    }

    public boolean canAfford(Ride ride) {
        return getWallet() >= ride.getPrice();
    }


    public boolean isOldEnough(Ride ride) {
        return getAge() >= ride.getMinAge();
    }

    public void buyTicket(Ride ride){
        this.wallet = this.wallet - ride.getPrice();
    }
}
