package control_flow.level_two;

import java.util.*;

public class Greatestfactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int greatestFactor = 1; // Initialize to 1

        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if it's a factor
                greatestFactor = i; // Assign the greatest factor
                break; // Exit loop once the first (largest) factor is found
            }
        }

        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

    }
}
