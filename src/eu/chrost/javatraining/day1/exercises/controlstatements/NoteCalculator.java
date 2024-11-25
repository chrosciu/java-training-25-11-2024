package eu.chrost.javatraining.day1.exercises.controlstatements;

/*

Zadanie 2: Kalkulator ocen
1.	Wczytaj z konsoli liczbę (0-100), która reprezentuje wynik procentowy z testu.
2.	Używając instrukcji if-else, przypisz odpowiednią ocenę:
o	0-49%: "Niedostateczny"
o	50-74%: "Dostateczny"
o	75-89%: "Dobry"
o	90-100%: "Bardzo dobry"
3.	Wyświetl ocenę w formacie:

Wynik: 85% - Ocena: Dobry
 */

import java.util.Scanner;

public class NoteCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ocenę (w %)");
        int note = Integer.parseInt(scanner.nextLine());

        if (note < 0 || note > 100) {
            System.out.println("Błędne dane !");
        } else if (note <= 49) {
            System.out.println("Niedostateczny");
        } else if (note <= 74) {
            System.out.println("Dostateczny");
        } else if (note <= 89) {
            System.out.println("Dobry");
        } else {
            System.out.println("Bardzo dobry");
        }

        scanner.close();
    }
}
