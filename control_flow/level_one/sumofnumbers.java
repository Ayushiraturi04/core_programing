package control_flow.level_one;

import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double number;

        // Taking input from user until 0 is entered
        System.out.print("Enter a number (0 to stop): ");
        while ((number = scanner.nextDouble()) != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
        }

        System.out.println("The total sum is: " + total);

    }
}
