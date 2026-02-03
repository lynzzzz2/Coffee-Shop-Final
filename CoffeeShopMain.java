package coffeeshop;

public class CoffeeShopMain {

    public static void main(String[] args) {

        Customer c1 = new Customer("Bang");
        Order o1 = new Order(101, c1, "Matcha");

        System.out.println( "---Classes Roles---\n" +
                c1.identify() + "\n" +
                o1.identify() + "\n"+
                o1.coffee.identify() + "\n\n" +
                "---Order Transaction---\n" +
                o1.processOrder()
        );
    }
}
