package eu.chrost.javatraining.day5.lectures.lambdas;

import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 6, 8, 9);

        int sumEven = numbers.stream()
                .filter(i -> i % 2 == 0)
                .reduce(0, (i1, i2) -> i1 + i2);

        System.out.println(sumEven);
    }
}
