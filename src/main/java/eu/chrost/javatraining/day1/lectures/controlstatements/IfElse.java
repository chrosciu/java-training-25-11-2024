package eu.chrost.javatraining.day1.lectures.controlstatements;

public class IfElse {
    public static void main(String[] args) {
        int number = 5;

//        if (number == 5) {
//            System.out.println("Number is equal to 5");
//        }
//
//        if (number != 5) {
//            System.out.println("Number is not equal to 5");
//        }

        if (number == 5) {
            System.out.println("Number is equal to 5");
        } else {
            System.out.println("Number is not equal to 5");
        }

        if (number == 6) {
            System.out.println("Number is equal to 6");
        } else {
            System.out.println("Number is not equal to 6");
        }

        if (number < 4) {
            System.out.println("Number is less than 4");
        } else if (number == 4) {
            System.out.println("Number is equal to 4");
        } else {
            System.out.println("Number is greater than 4");
        }

    }
}
