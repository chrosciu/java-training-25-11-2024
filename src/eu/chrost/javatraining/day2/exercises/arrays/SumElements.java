package eu.chrost.javatraining.day2.exercises.arrays;

/*

Zadanie 1: Suma elementów tablicy
1.	Stwórz tablicę jednowymiarową z liczbami całkowitymi (np. {1, 2, 3, 4, 5}).
2.	Oblicz sumę wszystkich elementów w tablicy, używając pętli for-each.
3.	Wyświetl wynik w formacie:
Suma elementów tablicy: 15

 */

public class SumElements {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 6, 8, 12, 100, -5};
        int sum = 0;
        for (int element : intArray) {
            sum += element;

        }
        System.out.println("Suma elementów tablicy: " + sum);
    }
}
