package Level_one;

import java.util.Scanner;

public class Yards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversion factors
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        System.out.printf("Your Distance in feet is %.2f while in yards is %.2f and miles is %.6f%n",
                distanceInFeet, distanceInYards, distanceInMiles);

    }
}
