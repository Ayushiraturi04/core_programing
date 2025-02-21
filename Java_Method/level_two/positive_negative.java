package level_two;

import java.util.Scanner;

public class positive_negative {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int num) {
        return num >= 0; // Returns true if positive, false if negative
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0; // Returns true if even, false if odd
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1; // Returns 1 if num1 is greater than num2
        } else if (num1 < num2) {
            return -1; // Returns -1 if num1 is less than num2
        } else {
            return 0; // Returns 0 if both numbers are equal
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store 5 numbers

        // Taking user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Checking each number for positivity and even/odd status
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is positive and ");
                if (isEven(num)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }

        // Comparing the first and last elements of the array
        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last number: ");
        if (result == 1) {
            System.out.println("First number is greater than last number.");
        } else if (result == -1) {
            System.out.println("First number is less than last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
    }
}
