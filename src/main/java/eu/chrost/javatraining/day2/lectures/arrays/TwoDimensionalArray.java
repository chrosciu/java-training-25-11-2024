package eu.chrost.javatraining.day2.lectures.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at " + i + "," + j + " => " + matrix[i][j]);
            }
        }

        System.out.println();

        int[][] initializedMatrix = {
                {2, 5, 7, 8},
                {5, 3, 4}
        };
        for (int i = 0; i < initializedMatrix.length; i++) {
            for (int j = 0; j < initializedMatrix[i].length; j++) {
                System.out.println("Element at " + i + "," + j + " => " + initializedMatrix[i][j]);
            }
        }
     }
}
