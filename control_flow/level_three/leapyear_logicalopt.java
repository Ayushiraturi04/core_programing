package control_flow.level_three;

import java.util.Scanner;

public class leapyear_logicalopt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking year input
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check leapYear using logical operator
        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

    }
}
