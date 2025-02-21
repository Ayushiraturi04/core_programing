package Level_one;

import java.util.Scanner;

public class km_to_miles { // Class name should follow PascalCase naming convention
    public static void main(String[] args) {
        // Taking input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert km to miles
        double miles = km * 1.6;

        // Display the result
        System.out.println("The total miles is: " + miles + " miles for the given " + km + " km.");
    }
}
