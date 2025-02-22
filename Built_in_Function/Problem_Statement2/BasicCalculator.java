package Problem_Statement2;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Get user input for operation choice and numbers
        int choice = getOperationChoice();
        double[] numbers = getNumbers();

        // Perform the selected operation
        double result = performOperation(choice, numbers[0], numbers[1]);

        // Display the result
        displayResult(choice, numbers[0], numbers[1], result);
    }

    // Function to display menu and get the operation choice
    public static int getOperationChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        return scanner.nextInt(); // Read user's choice
    }

    // Function to take two numbers as input
    public static double[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        double[] nums = new double[2];

        System.out.print("Enter first number: ");
        nums[0] = scanner.nextDouble();
        System.out.print("Enter second number: ");
        nums[1] = scanner.nextDouble();

        return nums; // Return array containing the two numbers
    }

    // Function to perform the selected operation
    public static double performOperation(int choice, double num1, double num2) {
        switch (choice) {
            case 1:
                return add(num1, num2); // Addition
            case 2:
                return subtract(num1, num2); // Subtraction
            case 3:
                return multiply(num1, num2); // Multiplication
            case 4:
                return divide(num1, num2); // Division
            default:
                System.out.println("Invalid choice! Exiting program.");
                System.exit(0);
                return 0; // Not reachable, but required for compilation
        }
    }

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division (checks for division by zero)
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            System.exit(0);
        }
        return a / b;
    }

    // Function to display the result
    public static void displayResult(int choice, double num1, double num2, double result) {
        String operator = (choice == 1) ? "+" : (choice == 2) ? "-" : (choice == 3) ? "*" : "/";
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
