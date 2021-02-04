package Builder;

public class Car {
    private int licensePlate;
    private String model;
    private String color;
    private int weight;
    private int length;

    public Car() {
    }

    public Car(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Builder getBuilder(){
        return new Car.Builder();
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate=" + licensePlate +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }

    public class Builder{
        private Builder() {
        }

        public Builder withModel(String model){
            Car.this.model = model;
            return this;
        }

        public Builder withColor(String color){
            Car.this.color = color;
            return this;
        }

        public Builder withWeight(int weight){
            Car.this.weight = weight;
            return this;
        }

        public Builder withLength(int length){
            Car.this.length = length;
            return this;
        }

        public Car build(){
            return Car.this;
        }
    }
}
