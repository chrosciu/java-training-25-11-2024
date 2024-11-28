package eu.chrost.javatraining.day1.lectures.basics;

public class Variables {
    public static void main(String[] args) {
        int intVariable = 5;
        long longVariable = 5;

        System.out.println(intVariable);
        System.out.println(longVariable);

        double doubleVariable = 3.5;
        System.out.println(doubleVariable);
        float floatVariable = 3.5f;
        System.out.println(floatVariable);

        boolean booleanVariable = false;
        System.out.println(booleanVariable);

        String stringVariable = "eu.chrost.javatraining.day1.lectures.basics.Hello";
        System.out.println(stringVariable);

        var anotherStringVariable = "eu.chrost.javatraining.day1.lectures.basics.Hello again";
        System.out.println(anotherStringVariable);

    }
}
