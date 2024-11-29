package eu.chrost.javatraining.day5.lectures.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BusinessException {
        int number = readNumberFromInput();
        if (number < 0) {
            throw new NegativeNumberException("Negative number " + number + " is not accepted");
        }
        System.out.println(number);
    }

    private static int readNumberFromInput() {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            return number;
        } catch (NumberFormatException e) {
            throw new BusinessException(e);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            scanner.close();
        }
    }
}
