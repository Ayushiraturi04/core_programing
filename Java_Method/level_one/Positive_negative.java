package level_one;

import java.util.Scanner;

public class Positive_negative {

    // Method to check if a number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1; // Positive number
        } else if (num < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calling the method to check number type
        int result = checkNumber(number);

        // Displaying the result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

    }
}
