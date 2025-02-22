package Problem_Statement2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Take input from the user
        int number = takeInput();

        // Calculate factorial using recursion
        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);
    }

    // Function to take input from the user
    public static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            System.exit(0); // Exit if input is negative
        }
        return num;
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 and 1 is 1
        }
        return n * calculateFactorial(n - 1); // Recursive case: n * (n-1)!
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
