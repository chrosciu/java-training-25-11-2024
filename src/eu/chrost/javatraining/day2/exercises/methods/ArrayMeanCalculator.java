package eu.chrost.javatraining.day2.exercises.methods;

/*

Zadanie 5: Obliczanie średniej
1.	Dodaj do klasy ArrayMeanCalculator metody:
o	average(int[] numbers) – oblicza średnią arytmetyczną elementów tablicy.
o	average(int[][] matrix) – oblicza średnią wszystkich elementów w dwuwymiarowej tablicy.
2.	W main() wczytaj dane od użytkownika i przetestuj obie metody.

 */

public class ArrayMeanCalculator {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7};
        System.out.println(average(numbers));

        int[][] matrix = {
                {3, 4},
                {1, 3, 6}
        };
        System.out.println(average(matrix));
    }

    public static double average(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static double average(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                ++count;
            }
        }
        return (sum / count);
    }

}
