package control_flow.level_three;

import java.util.Scanner;

public class harshadnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable and store original number
        int sum = 0, originalNumber = number;

        // Extract and sum up the digits
        while (number > 0) {
            sum += number % 10; // Extract last digit and add to sum
            number /= 10; // Remove last digit
        }

        // Check divisibility
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

    }
}
