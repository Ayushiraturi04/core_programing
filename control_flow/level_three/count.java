package control_flow.level_three;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize count variable
        int count = 0;
        int originalNumber = number; // Store the original number for reference

        // Handle special case for 0
        if (number == 0) {
            count = 1; // 0 has one digit
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                number /= 10; // Remove last digit
                count++; // Increase digit count
            }
        }

        System.out.println("The number " + originalNumber + " has " + count + " digits.");

    }
}
