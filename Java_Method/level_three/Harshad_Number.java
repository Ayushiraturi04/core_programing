package level_three;

import java.util.Arrays;

public class Harshad_Number {

    public static void main(String[] args) {
        int number = 156; // Example number

        // Count digits in the number
        System.out.println("Number of Digits: " + countDigits(number));

        // Extract digits of the number and store them in an array
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Calculate the sum of digits
        System.out.println("Sum of Digits: " + sumOfDigits(digits));

        // Calculate the sum of squares of the digits
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));

        // Check if the number is a Harshad number
        System.out.println(number + " is a Harshad Number: " + isHarshadNumber(number));

        // Find and display the frequency of each digit
        int[][] frequencyArray = digitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int[] freq : frequencyArray) {
            System.out.println("Digit: " + freq[0] + " -> Frequency: " + freq[1]);
        }
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length(); // Convert number to string and get its length
    }

    public static int[] getDigits(int num) {
        int numDigits = countDigits(num); // Get the number of digits
        int[] digits = new int[numDigits]; // Create an array to store digits
        int index = numDigits - 1; // Start filling from the last index

        while (num > 0) {
            digits[index--] = num % 10; // Extract last digit and store it
            num /= 10; // Remove the last digit
        }
        return digits;
    }

    // Method for sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit; // Add each digit to the sum
        }
        return sum;
    }

    // Method for sum of square of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Square each digit and add to the sum
        }
        return sum;
    }

    // Method for Harshad Number
    public static boolean isHarshadNumber(int num) {
        int sum = sumOfDigits(getDigits(num)); // Get the sum of digits
        return num % sum == 0; // Check if number is divisible by sum of digits
    }

    // Method for checking the frequency
    public static int[][] digitFrequency(int num) {
        int[] count = new int[10]; // Array to store frequency of digits 0-9
        int temp = num;

        // Count occurrences of each digit
        while (temp > 0) {
            count[temp % 10]++; // Increment count of extracted digit
            temp /= 10; // Remove the last digit
        }

        // Count the number of unique digits with non-zero frequency
        int nonZeroCount = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                nonZeroCount++;
            }
        }

        // Create a 2D array to store digit-frequency pairs
        int[][] frequencyArray = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                frequencyArray[index][0] = i; // Store digit
                frequencyArray[index][1] = count[i]; // Store frequency
                index++;
            }
        }
        return frequencyArray;
    }
}
