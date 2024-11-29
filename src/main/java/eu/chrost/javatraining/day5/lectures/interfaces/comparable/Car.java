package eu.chrost.javatraining.day5.lectures.interfaces.comparable;

public class Car implements Comparable<Car> {
    private final String brand;
    private final int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}
