package eu.chrost.javatraining.day2.lectures.methods;

public class SimpleMethods {
    public static void main(String[] args) {
        int[] array = {2, 4, 7};

        int[] doubledArray = multiplyArray(array, 2);
        int[] tripledArray = multiplyArray(array, 3);

        printArray(doubledArray);
        printArray(tripledArray);
    }

    public static int[] multiplyArray(int[] array, int multiplier) {
        int[] multipliedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            multipliedArray[i] = multiply(array[i], multiplier);
        }
        return multipliedArray;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println();
    }
}
