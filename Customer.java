package coffeeshop;

public class Customer {

    public String name;

    public Customer(String name) {
        this.name = name;
    }

    public String placeOrder() {
        return name + " placed an order.";
    }

    public String identify() {
        return "I am the Customer class. I store the customer’s name and handle actions like placing an order.";
    }
}
