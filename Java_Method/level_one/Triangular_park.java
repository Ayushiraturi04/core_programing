package level_one;

import java.util.Scanner;

public class Triangular_park {

    // Method to calculate the number of rounds needed
    public static double rounds(double perimeter, double distance) {
        return (int) (distance / perimeter); // Calculates how many times the athlete needs to run
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Scanner object to take user input

        // Taking input for the three sides of the triangular park
        System.out.print("Enter the first side of the triangle: ");
        double side1 = s.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        double side2 = s.nextInt();

        System.out.print("Enter the third side of the triangle: ");
        double side3 = s.nextInt();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        double distance = 5000.0; // Convert 5km to meters (5000 meters)

        // Calculate the number of rounds required to complete 5 km
        double calRounds = rounds(perimeter, distance);

        // Display the result
        System.out.println("The athlete needs to complete " + calRounds + " rounds to cover 5 km.");
        System.out.println("Perimeter of the park: " + perimeter + " meters.");
    }
}
