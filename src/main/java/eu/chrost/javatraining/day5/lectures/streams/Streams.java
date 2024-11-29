package eu.chrost.javatraining.day5.lectures.streams;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 6, 8, 9);

//        List<Integer> evenNumbers = new ArrayList<>();
//        for (int i: numbers) {
//            if (i % 2 == 0) {
//                evenNumbers.add(i);
//            }
//        }
//
//        int sumOfEven = 0;
//        for (int i: evenNumbers) {
//            sumOfEven += i;
//        }

        //1. stream construction
        Stream<Integer> stream = numbers.stream();

        //2. intermediate operations
        Stream<Integer> evenStream = stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });

        //3. terminal operation
        int sumEven = evenStream.reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });

        System.out.println(sumEven);

        sumEven = numbers.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0;
                    }
                })
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });

        System.out.println(sumEven);

        List<Integer> evenNumbers = numbers.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0;
                    }
                })
                .toList();

        System.out.println(evenNumbers);

    }
}
