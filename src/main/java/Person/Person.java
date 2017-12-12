package Person;

public class Person {
    protected int age;
    protected double wallet;

    public Person(int age, double wallet){
        this.age = age;
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public int getAge() {

        return age;
    }

}
