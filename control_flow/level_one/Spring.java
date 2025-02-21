package control_flow.level_one;

import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Checking if the date falls in the Spring Season (March 20 - June 20)
        boolean isSpring = (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);

        // Output result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

    }
}
