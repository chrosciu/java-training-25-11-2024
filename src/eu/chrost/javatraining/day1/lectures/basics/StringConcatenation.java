package eu.chrost.javatraining.day1.lectures.basics;

public class StringConcatenation {
    public static void main(String[] args) {
        String hello = "eu.chrost.javatraining.day1.lectures.basics.Hello";
        String world = "World!";

        String helloWorld = hello + world;
        System.out.println(helloWorld);
        System.out.println(hello + " " + world);

        int number = 7;
        String helloNumber = hello + number;
        System.out.println(helloNumber);
        System.out.println(number + hello);

        System.out.println(number + number);
        System.out.println("" + (number + number));

        System.out.println("Number value is: " + number);
    }
}
