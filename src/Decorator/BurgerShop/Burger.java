package Decorator.BurgerShop;

public abstract class Burger {
    private String describe = "Abstract burger";
    public String getDescribe(){
        return describe;
    }
    public abstract double cost();
}
