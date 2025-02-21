package control_flow.level_one;

import java.util.Scanner;

public class sumuntilzero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) { // Infinite loop
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = scanner.nextInt();

            if (num <= 0) { // Stop if the number is 0 or negative
                break;
            }

            sum += num; // Add to sum
        }

        System.out.println("Total sum: " + sum);

    }
}
