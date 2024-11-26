package eu.chrost.javatraining.day2.exercises.arrays;

/*

Zadanie 5: Średnia liczb w tablicy
1.	Wczytaj od użytkownika liczby zmiennoprzecinkowe jako argumenty
2.	Oblicz średnią arytmetyczną argumentowelementów tablicy.
3.	Wyświetl wynik w formacie:
Średnia: 23.45

 */

public class ArithmeticMean {
    public static void main(String[] args) {
        if (args.length > 0) {
            double sum = 0;
            for (String arg : args) {
                double number = Double.parseDouble(arg);
                sum += number;
            }
            double mean = sum / args.length;
            System.out.println("Srednia to " + mean);
        } else {
            System.out.println("Brak argumentów");
        }
    }
}
