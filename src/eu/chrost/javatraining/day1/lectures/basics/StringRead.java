package eu.chrost.javatraining.day1.lectures.basics;

import java.util.Scanner;

public class StringRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter line:");
        String nextLine = scanner.nextLine();
        System.out.println("Please enter another line:");
        String anotherLine = scanner.nextLine();
        scanner.close();
        System.out.println("Read line from input: " + nextLine + anotherLine);

        System.out.printf("Read line from input %s %s\n", nextLine, anotherLine);
    }
}
