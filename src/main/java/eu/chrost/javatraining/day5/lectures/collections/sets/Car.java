package eu.chrost.javatraining.day5.lectures.collections.sets;

import java.util.Objects;

public class Car {
    private final String brand;
    private final int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return year == car.year && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year);
    }
}
