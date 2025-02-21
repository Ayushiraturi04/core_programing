package control_flow.level_one;

import java.util.Scanner;

public class naturalnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number (N > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (N > 0).");
        } else {
            // Computing sum using while loop
            int sumWhileLoop = 0, i = 1;
            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }

            // Computing sum using formula
            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumWhileLoop);
            System.out.println("Sum using formula: " + sumFormula);

            // Comparing results
            if (sumWhileLoop == sumFormula) {
                System.out.println("Both computations match! ");
            } else {
                System.out.println("Mismatch in results! ");
            }
        }

    }
}
