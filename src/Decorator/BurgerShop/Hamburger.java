package Decorator.BurgerShop;

public class Hamburger extends Burger {
    private double cost = 45;
    private String describe = "Delicious hamburger";

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public double cost() {
        return cost;
    }
}
