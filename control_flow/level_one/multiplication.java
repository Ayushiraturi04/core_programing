package control_flow.level_one;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Printing multiplication table from 6 to 9
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
