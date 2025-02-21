package Level_one;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking height input in centimeters
        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        // Conversion factors
        double inches = heightInCm / 2.54; // Convert cm to inches
        int feet = (int) (inches / 12); // Get whole feet
        double remainingInches = inches % 12; // Get remaining inches

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n",
                heightInCm, feet, remainingInches);

    }
}
