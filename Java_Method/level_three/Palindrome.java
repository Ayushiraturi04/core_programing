package level_three;

import java.util.Arrays;

public class Palindrome {

    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length(); // Convert number to string and get its length
    }

    // Method to store digits of a number in an array
    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];

        // Extract each digit and store it in an array
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // Convert character to integer
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        // Reverse the order of elements in the array
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2); // Uses built-in method to compare arrays
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num); // Get the original digits
        int[] reversedDigits = reverseArray(digits); // Reverse the digits
        return areArraysEqual(digits, reversedDigits); // Compare original and reversed arrays
    }

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0") && numStr.charAt(0) != '0'; // Must contain '0' but not start with '0'
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int num = 1221; // Example number (change for testing)

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));

        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));

        System.out.println("Are the original and reversed arrays equal? " + areArraysEqual(digits, reversed));

        System.out.println("Is the number a Palindrome? " + isPalindrome(num));

        System.out.println("Is the number a Duck Number? " + isDuckNumber(num));
    }
}
