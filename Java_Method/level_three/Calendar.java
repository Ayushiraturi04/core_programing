package level_three;

import java.util.Scanner;

public class Calendar {

    // Array to store names of the months
    private static String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month (index 0 for January, 1 for
    // February, etc.)
    private static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt(); // Read the month input
        System.out.print("Enter the year: ");
        int year = scanner.nextInt(); // Read the year input

        // Update February's days if it's a leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // February has 29 days in a leap year
        }

        // Get the first day of the month using the Gregorian calendar algorithm
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar for the given month and year
        printCalendar(month, year, firstDay);
    }

    // Method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        // Leap year conditions: divisible by 4 and not by 100, unless also divisible by
        // 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month (0=Sunday, 1=Monday, ...,
    // 6=Saturday)
    private static int getFirstDayOfMonth(int month, int year) {
        // Zeller’s Congruence formula for calculating the first day of the month
        int y0 = year - (14 - month) / 12; // Adjust year based on month
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Calculate offset
        int m0 = month + 12 * ((14 - month) / 12) - 2; // Adjust month index
        int d0 = (1 + x + 31 * m0 / 12) % 7; // Compute day of the week (0=Sunday, ..., 6=Saturday)
        return d0;
    }

    // Method to print the calendar for the month
    private static void printCalendar(int month, int year, int firstDay) {
        System.out.println("\n" + monthNames[month - 1] + " " + year); // Print month and year header
        System.out.println("Sun Mon Tue Wed Thu Fri Sat"); // Print day headers

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print empty spaces before the first day
        }

        // Print the days of the month
        int daysInCurrentMonth = daysInMonth[month - 1]; // Get number of days in selected month
        for (int day = 1; day <= daysInCurrentMonth; day++) {
            System.out.printf("%3d ", day); // Print day number with proper spacing

            // Move to the next line after Saturday (7th column)
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Print a new line at the end if the last row is incomplete
        if ((firstDay + daysInCurrentMonth) % 7 != 0) {
            System.out.println();
        }
    }
}
