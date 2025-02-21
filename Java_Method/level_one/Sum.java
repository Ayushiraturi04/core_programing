package level_one;

import java.util.Scanner;

public class Sum {

    // Method to calculate the sum of first n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to take input

        // Taking input from user
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        // Validate input
        if (n < 1) {
            System.out.println("Please enter a positive number."); // Handle invalid input
        } else {
            // Calling the method and displaying the result
            int result = sumOfNaturalNumbers(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }
    }
}
