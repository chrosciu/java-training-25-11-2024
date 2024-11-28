package eu.chrost.javatraining.day4.lectures.inheritance;

public class Truck extends Car {
    private final int capacity;

    public Truck(String brand, int capacity) {
        super(brand);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public String whoAmI() {
        return super.whoAmI() + " And I am a truck!";
    }
}
