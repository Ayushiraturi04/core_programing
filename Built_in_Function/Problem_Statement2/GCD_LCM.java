package Problem_Statement2;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        // Take input from the user
        int[] numbers = takeInput();

        // Calculate GCD using the Euclidean algorithm
        int gcd = calculateGCD(numbers[0], numbers[1]);

        // Calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);

        // Display the results
        displayResults(numbers[0], numbers[1], gcd, lcm);
    }

    // Function to take input from the user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];

        // Prompt user to enter two numbers
        System.out.print("Enter first number: ");
        nums[0] = scanner.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = scanner.nextInt();

        return nums; // Return array containing the two numbers
    }

    // Function to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) { // Loop until remainder becomes 0
            int temp = b;
            b = a % b; // Update 'b' with the remainder of division
            a = temp; // Update 'a' with the previous 'b'
        }
        return a; // When loop ends, 'a' contains the GCD
    }

    // Function to calculate LCM using the formula: (a * b) / GCD
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd; // Compute and return LCM
    }

    // Function to display GCD and LCM results
    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
