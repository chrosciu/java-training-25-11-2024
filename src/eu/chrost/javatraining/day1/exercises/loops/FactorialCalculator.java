package eu.chrost.javatraining.day1.exercises.loops;

/*
Zadanie 6: Obliczanie silni
1.	Wczytaj z konsoli liczbę całkowitą N.
2.	Oblicz silnię liczby N (np. 5! = 5 x 4 x 3 x 2 x 1 = 120) przy użyciu pętli for lub while.
3.	Wyświetl wynik w formacie:

Silnia liczby 5 wynosi: 120
 */

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą");
        int n = Integer.parseInt(scanner.nextLine());
        int silnia = 1;

        for (int i =1; i <= n ; i++) {
            silnia = silnia * i;

        }
        System.out.println("Silnia liczby " + n + " wynosi: " + silnia);
    }
}
