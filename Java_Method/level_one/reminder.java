package level_one;

import java.util.Scanner;

public class reminder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Division to get quotient
        int remainder = number % divisor; // Modulus to get remainder

        return new int[] { quotient, remainder }; // Returning both as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Validate divisor (cannot be zero)
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Call the method to compute quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        scanner.close(); // Close scanner
    }
}
