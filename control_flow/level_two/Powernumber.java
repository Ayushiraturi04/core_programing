package control_flow.level_two;

import java.util.Scanner;

public class Powernumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the exponent (power): ");
        int power = scanner.nextInt();

        int result = 1; // Initialize result to 1

        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the base number
        }

        System.out.println(number + " raised to the power of " + power + " is: " + result);

    }
}
