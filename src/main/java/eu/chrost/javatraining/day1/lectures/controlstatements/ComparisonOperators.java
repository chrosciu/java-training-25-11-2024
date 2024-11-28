package eu.chrost.javatraining.day1.lectures.controlstatements;

public class ComparisonOperators {
    public static void main(String[] args) {
        int number = 5;

        if (number == 5) {
            System.out.println("Number is equal to 5");
        }

        boolean isEqualToFive = (number == 5);

        if (isEqualToFive) {
            System.out.println("Number is equal to 5");
        }

        if (number != 6) {
            System.out.println("Number is not equal to 6");
        }

        if (number > 3) {
            System.out.println("Number is greater than 3");
        }

        if (number >= 3) {
            System.out.println("Number is greater than 3 or equal to 3");
        }

        if (number < 10) {
            System.out.println("Number is less than 10");
        }

        if (number <= 10) {
            System.out.println("Number is less than 10 or equal to 10");
        }

        if ((number > 3) & (number < 10)) {
            System.out.println("Number is greater than 3 and less than 10");
        }

        if ((number > 3) && (number < 10)) {
            System.out.println("Number is greater than 3 and less than 10");
        }

        if ((number > 3) | (number < 10)) {
            System.out.println("Number is greater than 3 or less than 10");
        }

        if ((number > 3) || (number < 10)) {
            System.out.println("Number is greater than 3 or less than 10");
        }

        if (!(number < 3)) { // equal to number >=3 )
            System.out.println("Number is not less than 3");
        }
    }
}
