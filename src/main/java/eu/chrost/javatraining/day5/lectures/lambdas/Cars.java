package eu.chrost.javatraining.day5.lectures.lambdas;

import java.util.List;
import java.util.function.Consumer;

record Car(String brand) {
}

public class Cars {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Mercedes"), new Car("Ford"), new Car("BMW")
        );
        for (Car car : cars) {
            doSomethingForCar(car, c -> System.out.println(c.brand()));
        }
    }

    private static void doSomethingForCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }
}
