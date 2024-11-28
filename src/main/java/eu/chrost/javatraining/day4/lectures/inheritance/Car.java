package eu.chrost.javatraining.day4.lectures.inheritance;

public class Car {
    protected final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String whoAmI() {
        return "I am a car!";
    }
}
