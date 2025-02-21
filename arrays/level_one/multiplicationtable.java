package level_one;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input of arrays size
        System.out.print("Enter a number for multiplication table: ");
        int number = scanner.nextInt();

        // // Taking an array
        int[] table = new int[10];


        // Counting the table
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

    }
}
