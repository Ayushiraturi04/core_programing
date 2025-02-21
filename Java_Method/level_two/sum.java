package level_two;

import java.util.Scanner;

public class sum {

    // Recursive method to calculate sum of first n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1)
            return 1; // Base case
        return n + sumRecursive(n - 1); // Recursive call
    }

    // Formula-based method to calculate sum
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2; // Using formula: n * (n + 1) / 2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        // Validate input
        if (n < 1) {
            System.out.println("Invalid input! Please enter a positive natural number.");
            return;
        }

        // Compute sum using recursion and formula
        int sumRecursive = sumRecursive(n);
        int sumFormula = sumFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Verify if both results match
        if (sumRecursive == sumFormula) {
            System.out.println("Both methods produced the correct sum.");
        } else {
            System.out.println("Mismatch in results. Check the logic!");
        }
    }
}
