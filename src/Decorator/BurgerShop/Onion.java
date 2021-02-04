package Decorator.BurgerShop;

public class Onion extends ExtraToppings {
    private double cost = 10;
    private String describe = "Onion";
    private Burger addition;

    public Onion(Burger addition) {
        this.addition = addition;
    }

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public double cost() {
        return cost + addition.cost();
    }
}
