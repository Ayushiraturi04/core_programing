package control_flow.level_three;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int sum = 0, originalNumber = number;

        // Process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract last digit
            sum += digit * digit * digit; // Add cube of digit to sum
            originalNumber /= 10; // Remove last digit
        }

        // Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

    }
}
