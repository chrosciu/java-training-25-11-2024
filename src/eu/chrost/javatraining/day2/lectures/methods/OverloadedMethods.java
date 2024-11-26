package eu.chrost.javatraining.day2.lectures.methods;

public class OverloadedMethods {
    public static void main(String[] args) {
        int[] array = {3, 4, 7};

        System.out.println(sum(array));
        System.out.println(sum(array[0], array[2]));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a) {
        return sum(a, 0);
    }

    public static int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

}
