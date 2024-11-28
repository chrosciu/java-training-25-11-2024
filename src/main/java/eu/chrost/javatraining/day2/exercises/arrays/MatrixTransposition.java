package eu.chrost.javatraining.day2.exercises.arrays;

import java.util.Arrays;

/*
Zadanie 11: Transponowanie macierzy
Utwórz dwuwymiarową tablicę int[3][2] (np. {{1, 2}, {3, 4}, {5, 6}}).
Zamień wiersze na kolumny, tworząc nową tablicę int[2][3].
Wyświetl pierwotną i transponowaną tablicę.
 */

public class MatrixTransposition {
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {2, 5, 7},
                {5, 3, 4},
                {8, 4, 3},
                {1, 1, 1}
        };
        /*
        expected result
        {
            {2, 5, 8, 1},
            {5, 3, 4, 1},
            {7, 4, 3, 1}
        }
        */

        // matrix transposition
        int[][] transposedMatrix = new int[originalMatrix[0].length][originalMatrix.length];
        for (int i = 0; i < originalMatrix.length; i++){
            for (int j = 0; j < originalMatrix[0].length; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }
        // printing original matrix
        for (int[] matrix : originalMatrix) {
            System.out.println(Arrays.toString(matrix)); //Arrays.toString => hint by IDE
        }
        System.out.println();
        // printing transposed matrix
        for (int[] matrix: transposedMatrix) {
            System.out.println(Arrays.toString(matrix));
        }
    }
}
