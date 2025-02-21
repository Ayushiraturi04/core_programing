package control_flow.level_three;

import java.util.Scanner;

public class abundant_number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable
        int sum = 0;

        // Loop through all divisors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor
                sum += i; // Add divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

    }
}
