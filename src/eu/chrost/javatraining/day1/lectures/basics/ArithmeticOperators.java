package eu.chrost.javatraining.day1.lectures.basics;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = a / (double)b;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);


        double d = b;
        System.out.println(d);

        System.out.printf("%.4f%n", d);

        int e = (int)d;
        System.out.println(e);
    }
}
