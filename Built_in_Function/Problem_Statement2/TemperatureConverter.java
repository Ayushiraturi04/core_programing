package Problem_Statement2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Take input from the user
        int choice = getConversionChoice();
        double temperature = getTemperatureInput();

        // Perform the conversion based on user choice
        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temperature);
            displayResult(temperature, celsius, "Fahrenheit", "Celsius");
        } else {
            double fahrenheit = celsiusToFahrenheit(temperature);
            displayResult(temperature, fahrenheit, "Celsius", "Fahrenheit");
        }
    }

    // Function to get the conversion choice from the user
    public static int getConversionChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        return scanner.nextInt(); // Read user choice
    }

    // Function to get the temperature value from the user
    public static double getTemperatureInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        return scanner.nextDouble(); // Read user input
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Conversion formula
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Conversion formula
    }

    // Function to display the conversion result
    public static void displayResult(double input, double output, String fromUnit, String toUnit) {
        System.out.printf("%.2f %s is %.2f %s.%n", input, fromUnit, output, toUnit);
    }
}
