package eu.chrost.javatraining.day1.lectures.controlstatements;

public class VariableScopes {
    public static void main(String[] args) {
        int number = 5;

        if (number == 5) {
            String text = "Number is equal to 5";
            System.out.println(text);
            System.out.println(number);
        }

        //System.out.println(text) - does not compile - text is not visible outside of if block

        if (number == 5) {
            //
        } else {
            System.out.println("This should not be printed");
            System.out.println("This also should not be printed");
        }

    }
}
