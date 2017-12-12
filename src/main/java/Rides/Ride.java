package Rides;

import Person.Customer;

import java.util.ArrayList;

public abstract class Ride implements IMove {
    private String name;
    private double price;
    private int minAge;
    private int capacity;
    private ArrayList<Customer>queue;

    public Ride(String name, double price, int minAge, int capacity) {
        this.name = name;
        this.price = price;
        this.minAge = minAge;
        this.capacity = capacity;
        this.queue = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public double getPrice() {

        return this.price;
    }

    public int getCapacity(){

        return this.capacity;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void setCapacity(int capacity) {

        this.capacity = capacity;
    }

    public void setMinAge(int minAge) {

        this.minAge = minAge;
    }



    public ArrayList<Customer> getQueue() {
        return queue;
    }

//    public void addCustomer(Customer customer){
//        queue.add(customer);
//    }


   public String canMove(Ride ride){
       return "Get ready";
    }

    public void add(Customer customer2) {
        this.queue.add(customer2);
    }
}
