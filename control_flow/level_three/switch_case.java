package control_flow.level_three;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = scanner.next(); // Operator input

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        double result; // To store the result

        // Perform operations using switch...case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
            case "/":
                if (second != 0) { // Prevent division by zero
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator! Please enter +, -, *, or /.");
        }

    }
}
