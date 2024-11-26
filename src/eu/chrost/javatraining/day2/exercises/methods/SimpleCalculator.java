package eu.chrost.javatraining.day2.exercises.methods;

/*

Zadanie 1: Kalkulator prosty
1.	Napisz klasę SimpleCalculator i dodaj do niej publiczne statyczne metody:
o	add(int a, int b) – zwraca sumę dwóch liczb całkowitych.
o	add(double a, double b) – zwraca sumę dwóch liczb zmiennoprzecinkowych.
o	add(int[] numbers) – zwraca sumę wszystkich elementów w tablicy liczb całkowitych.
2.	W main() przetestuj wszystkie wersje metody add, wyświetlając wyniki.

 */

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println(add(3, 2));
        System.out.println(add(3.0, 2.0));
        int[] array = {2, 3, 4, 5};
        System.out.println(add(array));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}



