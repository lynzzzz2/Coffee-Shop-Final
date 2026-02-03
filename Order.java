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

     public String processOrder() {
        return "Processing Order #" + orderNumber + "\n"
                + customer.placeOrder() + "\n"
                + coffee.brew();
    }

    public String identify() {
        return "I am the Order class. I store the order number and manage the relationship between the customer and the coffee.";
    }
}

