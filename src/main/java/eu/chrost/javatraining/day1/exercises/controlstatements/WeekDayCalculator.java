package eu.chrost.javatraining.day1.exercises.controlstatements;

/*

Zadanie 3: Kalkulator dni tygodnia
1.	Wczytaj z konsoli liczbę od 1 do 7.
2.	Użyj instrukcji switch, aby przypisać liczbie odpowiedni dzień tygodnia:
o	1: "Poniedziałek"
o	2: "Wtorek"
o	...
o	7: "Niedziela"
3.	Jeśli użytkownik poda liczbę spoza zakresu 1-7, wyświetl komunikat "Niepoprawny numer dnia."
 */

import java.util.Scanner;

public class WeekDayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę od 1 do 7");
        int result = Integer.parseInt(scanner.nextLine());

        String weekDay = switch (result) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piatek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Podano liczbę z poza zakresu";
        };

        System.out.println(weekDay);
    }
}
