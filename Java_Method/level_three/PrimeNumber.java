package level_three;

public class PrimeNumber {

    // Method to check if a number is a prime number
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false; // Prime numbers are greater than 1
        for (int i = 2; i * i <= num; i++) { // Check divisibility up to the square root of the number
            if (num % i == 0)
                return false; // If divisible, it's not a prime number
        }
        return true; // If no factors found, the number is prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int num) {
        int square = num * num; // Find the square of the number
        int sum = 0;

        // Sum the digits of the square
        while (square > 0) {
            sum += square % 10; // Extract last digit and add to sum
            square /= 10; // Remove last digit
        }
        return sum == num; // If sum equals the original number, it's a neon number
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;

        // Calculate sum and product of digits
        while (num > 0) {
            int digit = num % 10; // Extract last digit
            sum += digit; // Add to sum
            product *= digit; // Multiply for product
            num /= 10; // Remove last digit
        }
        return sum == product; // If sum equals product, it's a spy number
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num; // Compute square of the number
        String numStr = String.valueOf(num); // Convert number to string
        String squareStr = String.valueOf(square); // Convert square to string

        return squareStr.endsWith(numStr); // If square ends with the number itself, it's automorphic
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7; // A buzz number is divisible by 7 or ends in 7
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int num = 25; // Example number (change for testing)

        System.out.println("Number: " + num);
        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Neon? " + isNeon(num));
        System.out.println("Is Spy? " + isSpy(num));
        System.out.println("Is Automorphic? " + isAutomorphic(num));
        System.out.println("Is Buzz? " + isBuzz(num));
    }
}
