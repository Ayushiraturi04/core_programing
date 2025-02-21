package level_three;

import java.util.*;

public class NumberCheckerpow {

    // Method to count the number of digits in a given number
    public static int countDigits(int num) {
        return String.valueOf(num).length(); // Convert number to string and get its length
    }

    // Method to store individual digits of a number in an array
    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num); // Convert number to string
        int[] digits = new int[numStr.length()]; // Create an array to store digits

        // Loop through the string and store each digit in the array
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // Convert char to integer
        }

        return digits; // Return the array containing digits
    }

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num); // Convert number to string
        return numStr.contains("0") && numStr.charAt(0) != '0'; // Must contain '0' but not start with it
    }

    // Method to check if a number is an Armstrong Number
    public static boolean isArmstrongNumber(int num) {
        int[] digits = getDigitsArray(num); // Get the digits of the number
        int power = digits.length; // Number of digits (power to raise each digit)
        int sum = 0; // Variable to store sum of powered digits

        // Loop through each digit and compute its power sum
        for (int digit : digits) {
            sum += Math.pow(digit, power); // Raise digit to the power of the total digit count
        }

        return sum == num; // Return true if sum equals the original number
    }

    // Method to find the largest and second largest digit in the number
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE; // Variable to store the largest digit
        int secondLargest = Integer.MIN_VALUE; // Variable to store the second largest digit

        // Loop through the digits to find the largest and second largest
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = digit; // Update largest digit
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit; // Update second largest if it's not equal to the largest
            }
        }

        // Display results
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }

    // Method to find the smallest and second smallest digit in the number
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE; // Variable to store the smallest digit
        int secondSmallest = Integer.MAX_VALUE; // Variable to store the second smallest digit

        // Loop through the digits to find the smallest and second smallest
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest; // Update second smallest before updating smallest
                smallest = digit; // Update smallest digit
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit; // Update second smallest if it's not equal to the smallest
            }
        }

        // Display results
        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int num = 153; // Change this number for different tests

        // Display the number
        System.out.println("Number: " + num);

        // Count and display the number of digits
        System.out.println("Digit Count: " + countDigits(num));

        // Get and display the digits array
        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // Check and display if the number is a Duck Number
        System.out.println("Is Duck Number? " + isDuckNumber(num));

        // Check and display if the number is an Armstrong Number
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(num));

        // Find and display the largest and second largest digits
        findLargestAndSecondLargest(digits);

        // Find and display the smallest and second smallest digits
        findSmallestAndSecondSmallest(digits);
    }
}
