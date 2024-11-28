package eu.chrost.javatraining.day2.lectures.arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[1] = 1;
        intArray[2] = 200;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at " + i + " => " + intArray[i]);
        }

        System.out.println();

        int[] intArrayInitialized = {3, 4, 6};

        for (int i = 0; i < intArrayInitialized.length; i++) {
            System.out.println("Element at " + i + " => " + intArrayInitialized[i]);
        }
    }
}
