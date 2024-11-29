package eu.chrost.javatraining.day5.lectures.interfaces.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Fiat", 2005),
                new Car("Fiat", 2010),
                new Car("Passat", 2003)
        };

        Arrays.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();

        BrandComparator brandComparator = new BrandComparator();

        Arrays.sort(cars, brandComparator);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();

        //anonymous class / interface
        Comparator<Car> ageComparatorYoungestFirst = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getYear() - o1.getYear();
            }
        };

        Arrays.sort(cars, ageComparatorYoungestFirst);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();

    }
}
