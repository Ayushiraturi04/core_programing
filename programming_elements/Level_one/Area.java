package Level_one;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for base and height in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = scanner.nextDouble();

        // Converting cm to inches (1 inch = 2.54 cm)
        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        // Calculating area in square centimeters and square inches
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaInch2 = 0.5 * baseInches * heightInches;

        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f%n",
                heightCm, heightCm / 30.48, heightCm / 2.54);

    }
}
