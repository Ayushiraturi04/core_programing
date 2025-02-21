package control_flow.level_three;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking year input
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check with Gregorian calendar
        if (year < 1582) {
            System.out.println("Invalid input! The year must be 1582 or later.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

    }
}
