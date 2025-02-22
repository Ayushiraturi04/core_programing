package Problem_Statement2;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        // Take input from the user
        int number = takeInput();

        // Check if the number is prime
        boolean isPrime = checkPrime(number);

        // Display result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to take input from the user
    public static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Function to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisibility up to sqrt(num)
            if (num % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}
