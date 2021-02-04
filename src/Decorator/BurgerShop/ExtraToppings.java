package Decorator.BurgerShop;

public abstract class ExtraToppings extends Burger {
    private String describe = "Abstract topping";

    @Override
    public String getDescribe(){
        return describe;
    }

    @Override
    public abstract double cost();
}
