package level_one;

import java.util.Scanner;

public class temperature {

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {

        // Calculates wind chill temperature based on air temperature and wind speed
        // using an empirical formula.
        return 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();

        // Validate wind speed (should be > 0)
        if (windSpeed < 0) {
            System.out.println("Error: Wind speed must be positive.");
        } else {
            // Compute wind chill
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display result
            System.out.println("Wind Chill Temperature: " + windChill + " °F");
        }

    }
}
