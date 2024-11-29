package eu.chrost.javatraining.day5.lectures.collections.lists;

public class ArraysWeakSides {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4};

        //add next number to array
        int[] extendedNumbers = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            extendedNumbers[i] = numbers[i];
        }
        extendedNumbers[numbers.length] = 5;
    }

}
