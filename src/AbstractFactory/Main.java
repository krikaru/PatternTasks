package AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractFurnitureFactory factory;
        String factoryType;
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()){
            case "modern":
                factory = new ModernFurnitureFactory();
                break;
            case "classic":
                factory = new ClassicFurnitureFactory();
                break;
            default :
                System.out.println("Wrong parameter");
                factory = null;
                break;
        }

        System.out.println(factory.getChair().getDescribe());
    }
}
