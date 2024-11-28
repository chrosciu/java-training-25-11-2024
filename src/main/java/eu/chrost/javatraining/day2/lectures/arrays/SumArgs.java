package eu.chrost.javatraining.day2.lectures.arrays;

public class SumArgs {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            int number = Integer.parseInt(arg);
            sum += number;
        }
        System.out.println("Sum of arguments: " + sum);
    }
}
