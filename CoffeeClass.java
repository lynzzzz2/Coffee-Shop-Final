package coffeeshop;

public class Coffee {

    public String coffeeType;

    public Coffee(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String brew() {
        return "Brewing a cup of " + coffeeType + ".";
    }

    public String identify() {
        return "I am the Coffee class. I store the type of coffee and handle the brewing process.";
    }
}
