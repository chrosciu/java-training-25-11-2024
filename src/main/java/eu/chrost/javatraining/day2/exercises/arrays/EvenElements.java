package eu.chrost.javatraining.day2.exercises.arrays;

/*

Zadanie 3: Tablica z liczbami parzystymi
1.	Utwórz tablicę z liczbami od 1 do 20.
2.	Wypisz tylko liczby parzyste z tablicy, używając pętli for-each.
3.	Wynik powinien wyglądać tak:

2 4 6 8 10 12 14 16 18 20
*/

public class EvenElements {
    public static void main(String[] args) {
        int[] intArray = new int[20];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }

        for (int i : intArray) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
