package control_flow.level_three;

import java.util.*;

public class primeornot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number greater than 1: ");
        int num = scanner.nextInt();

        // Prime number check for numbers greater than 1
        if (num <= 1) {
            System.out.println("Invalid input! Enter a number greater than 1.");
        } else {
            boolean isPrime = true; // Assume number is prime

            // Loop from 2 to num-1 to check divisibility
            for (int i = 2; i <= Math.sqrt(num); i++) { // Optimization: Check up to √num
                if (num % i == 0) {
                    isPrime = false; // Number is divisible by i
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is NOT a Prime Number.");
            }
        }

    }
}
