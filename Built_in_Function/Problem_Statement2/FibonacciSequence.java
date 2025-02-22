package Problem_Statement2;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        // Take input from the user
        int terms = takeInput();

        // Generate and print the Fibonacci sequence
        generateFibonacci(terms);
    }

    // Function to take input from the user
    public static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        return scanner.nextInt(); // Read and return user input
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1; // Initialize first two Fibonacci numbers

        // Handle edge case where user enters 0 or a negative number
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.println("Fibonacci sequence:");

        // Loop to generate Fibonacci numbers up to 'n' terms
        for (int i = 0; i < n; i++) {
            System.out.print(first + " "); // Print the current Fibonacci number
            int next = first + second; // Calculate the next number in the sequence
            first = second; // Update first number
            second = next; // Update second number
        }
    }
}
