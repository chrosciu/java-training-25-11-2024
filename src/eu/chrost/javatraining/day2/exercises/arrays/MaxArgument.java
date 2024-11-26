package eu.chrost.javatraining.day2.exercises.arrays;

/*

Zadanie 2: Szukanie największego elementu
1.	Wczytaj od użytkownika liczby całkowite jak argumenty programu
2.	Znajdź największy element w tablicy, używając pętli for-each.
3.	Wyświetl wynik w formacie:

Największy argument to: 42
 */

public class MaxArgument {
    public static void main(String[] args) {
        if (args.length > 0) {
            int maxElement = Integer.parseInt(args[0]);
            for (String arg : args) {
                int intArg = Integer.parseInt(arg);
                if (maxElement < intArg) {
                    maxElement = intArg;
                }
            }
            System.out.println("Największy argument to: " + maxElement);
        } else {
            System.out.println("Brak argumentow");
        }
    }
}
