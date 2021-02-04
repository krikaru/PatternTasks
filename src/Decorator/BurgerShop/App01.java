package Decorator.BurgerShop;

public class App01 {
    public static void main(String[] args) {
        Burger burger = new Cheese(new Onion(new BigMac()));
        System.out.println(burger.cost());
    }
}
