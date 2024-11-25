package eu.chrost.javatraining.day1.exercises.basics;

import java.util.Scanner;

/* Zadanie 1: Obliczanie wieku
1.	Wczytaj z konsoli bieżący rok oraz rok urodzenia użytkownika.
2.	Oblicz wiek użytkownika.
3.	Wyświetl wynik w formacie:
Twój wiek to: <wiek> */

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź bieżący rok:");
        String inputCurrentYear = scanner.nextLine();
        int currentYear = Integer.parseInt(inputCurrentYear);

        System.out.println("Wprowadź Twój rok urodzenia:");
        String inputBirthYear = scanner.nextLine();
        int birthYear = Integer.parseInt(inputBirthYear);

        int age = currentYear - birthYear;
        System.out.println("Twój wiek to:" + age);

        scanner.close();
    }
}
