package coffeeshop;

public class Order {

    public int orderNumber;
    public Customer customer;   // Aggregation
    public Coffee coffee;       // Composition

 public Order(int orderNumber, Customer customer, String coffeeType) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.coffee = new Coffee(coffeeType); // Created inside → Composition
    }
