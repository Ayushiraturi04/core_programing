package level_one;

import java.util.Scanner;

public class smallest_largest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3)); // Find smallest number
        int largest = Math.max(number1, Math.max(number2, number3)); // Find largest number

        return new int[] { smallest, largest }; // Return both values in an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Call method to find smallest and largest number
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

    }
}
