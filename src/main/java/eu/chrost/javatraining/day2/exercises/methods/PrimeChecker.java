package eu.chrost.javatraining.day2.exercises.methods;

/*

Zadanie 9: Liczba pierwsza
1.	Dodaj do klasy PrimeChecker metodę isPrime(int number) – sprawdza, czy liczba jest pierwsza.
2.	Dodaj przeciążoną wersję isPrime(int number, boolean verbose) – wypisuje proces sprawdzania na konsoli, gdy verbose = true.
3.	W main() wczytaj liczbę od użytkownika i przetestuj obie wersje metody.

 */

public class PrimeChecker {
    public static void main(String[] args) {
        int number = 77;
        System.out.println(isPrime(number));
        System.out.println(isPrime(number, true));
        System.out.println(isPrime(number, false));
    }

    public static boolean isPrime(int number) {
        return isPrime(number, false);
    }

    public static boolean isPrime(int number, boolean verbose) {
        if (verbose) {
            System.out.println("Testing if " + number + " is prime");
        }
        if (number <= 1) {
            if (verbose) {
                System.out.println("Number is less or equal to 1 - cannot be prime!");
            }
            return false;
        }
        for (int i = 2; i <= Math.ceil(Math.sqrt(number)); ++i) {
            if (verbose) {
                System.out.println("Testing division by " + i);
            }
            if (number % i == 0) {
                if (verbose) {
                    System.out.println("Number is not prime - is divisible by " + i);
                }
                return false;
            }
        }
        if (verbose) {
            System.out.println("Number is prime");
        }
        return true;
    }
}
