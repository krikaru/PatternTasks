package Builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(753);
        System.out.println(car);
        car.getBuilder().withColor("red")
                        .withLength(2500)
                        .withModel("Tesla")
                        .withWeight(1000);
        System.out.println(car);
    }
}
