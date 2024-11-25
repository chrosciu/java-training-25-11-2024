package eu.chrost.javatraining.day1.lectures.controlstatements;

public class Switch {
    public static void main(String[] args) {
        int number = 5;

        switch (number) {
            case 5:
                System.out.println("Number is equal to 5");
                break;
            case 4:
                System.out.println("Number is equal to 4");
                break;
            default:
                System.out.println("Number is not equal to 4 or to 5");
        }

        switch (number) {
            case 5 -> System.out.println("Number is equal to 5");
            case 4 -> {
                System.out.println("Number is equal to 4");
                System.out.println("Some text for 4");
            }
            default -> System.out.println("Number is not equal to 4 or to 5");
        }
    }
}
