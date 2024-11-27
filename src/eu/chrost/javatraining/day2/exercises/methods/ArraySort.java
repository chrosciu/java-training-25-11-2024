package eu.chrost.javatraining.day2.exercises.methods;

/*

Zadanie 6: Sortowanie tablic
1.	Dodaj do klasy ArraySort metody:
o	sort(int[] array) – sortuje tablicę rosnąco.
o	sort(int[] array, boolean descending) – sortuje tablicę rosnąco lub malejąco, w zależności od wartości descending.
2.	W main() stwórz tablicę liczb całkowitych, przetestuj metody i wyświetl wyniki.

 */

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 3, 1, 8, 8, 9};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        sort(numbers, true);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] array) {
        sort(array, false);
    }

    public static void sort(int[] array, boolean descending) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean swapNeeded = descending ? array[j] < array[j + 1] : array[j] > array[j + 1];
                if (swapNeeded) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
