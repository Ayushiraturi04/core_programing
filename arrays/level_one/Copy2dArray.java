package level_one;

import java.util.Scanner;

public class Copy2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for rows
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();

        // Taking user input for columns
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();

        // Initialising the matrix
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element for row " + (i + 1) + " and column " + (j + 1));
                matrix[i][j] = sc.nextInt();
            }
        }

        // Copy the element and increment the index
        int[] array = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Printing the 2d array
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}