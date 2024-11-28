package eu.chrost.javatraining.day1.lectures.basics;

import java.util.Scanner;

public class NumberRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        String nextLine = scanner.nextLine();
        scanner.close();
        int nextNumber = Integer.parseInt(nextLine);
        System.out.println("Next number: " + nextNumber);

        String nextNumberAsString = Integer.toString(nextNumber);
        System.out.println("Next number as string: " + nextNumberAsString);
    }
}
