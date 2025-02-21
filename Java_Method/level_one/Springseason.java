package level_one;

import java.util.Scanner;

public class Springseason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take user input

        // Prompting user for month input
        System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();

        // Prompting user for day input
        System.out.println("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Calling the method to check if it's spring season
        boolean result = checkSpringSeason(month, day);

        // Displaying the result based on boolean value
        if (result) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean checkSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) { // March 20 or later
            return true;
        } else if (month == 4 || month == 5) { // Whole months of April and May
            return true;
        } else if (month == 6 && day <= 20) { // June 20 or earlier
            return true;
        } else {
            return false; // All other dates are not in Spring Season
        }
    }
}
