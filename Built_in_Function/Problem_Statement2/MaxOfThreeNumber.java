package Problem_Statement2;

import java.util.Scanner;

public class MaxOfThreeNumber {
    public static void main(String[] args) {
        // Take three integer inputs from the user
        int[] numbers = takeInput();

        // Find the maximum number
        int max = findMax(numbers[0], numbers[1], numbers[2]);

        // Display the result
        System.out.println("The maximum number is: " + max);
    }

    // Function to take input from the user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.print("Enter first number: ");
        nums[0] = scanner.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = scanner.nextInt();
        System.out.print("Enter third number: ");
        nums[2] = scanner.nextInt();

        return nums;
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); // Uses Math.max for simplicity
    }
}
