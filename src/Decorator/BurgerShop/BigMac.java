package Decorator.BurgerShop;

public class BigMac extends Burger {
    private double cost = 150;
    private String describe = "Delicious BigMac";

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public double cost() {
        return cost;
    }


}
