package eu.chrost.javatraining.day1.exercises.loops;

/*

Zadanie 2: Suma liczb od 1 do N
1.	Wczytaj z konsoli liczbę całkowitą N.
2.	Oblicz i wyświetl sumę liczb od 1 do N (np. dla N=5 wynik to 15).
3.	Wykorzystaj pętlę for lub while.

 */

import java.util.Scanner;

public class SumNumbersWithFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą");
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <=n; ++i) {
            sum = sum + i;
        }
        System.out.println("Suma liczb: " + sum);
    }
}
