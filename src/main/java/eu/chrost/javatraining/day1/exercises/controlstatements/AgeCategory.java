package eu.chrost.javatraining.day1.exercises.controlstatements;

/*

Zadanie 1: Kategoryzacja wieku
1.	Wczytaj z konsoli wiek użytkownika (liczba całkowita).
2.	Napisz program, który na podstawie wieku wyświetli odpowiedni komunikat:
o	Jeśli wiek jest poniżej 18 lat: "Jesteś niepełnoletni."
o	Jeśli wiek jest między 18 a 65 lat: "Jesteś osobą dorosłą."
o	Jeśli wiek jest powyżej 65 lat: "Jesteś seniorem."
 */

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wiek");
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 18) {
            System.out.println("Jesteś niepełnoletni");
        } else if (age <= 65) {
            System.out.println("Jesteś osobą dorosłą");
        } else {
            System.out.println("Jesteś seniorem");
        }

        scanner.close();
    }
}
