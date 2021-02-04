package Decorator.BurgerShop;

public class Cheese extends ExtraToppings {
    private double cost = 15;
    private String describe = "Cheese";
    private Burger additional;

    public Cheese(Burger additional) {
        this.additional = additional;
    }

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public double cost() {
        return cost + additional.cost();
    }
}
