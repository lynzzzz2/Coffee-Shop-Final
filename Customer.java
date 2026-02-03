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