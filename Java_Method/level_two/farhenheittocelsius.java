package level_two;

import java.util.Scanner;

public class farhenheittocelsius {
    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Test conversions
        System.out.println("Enter the value of fahrenheit:");
        double fahrenheit = s.nextDouble();

        System.out.println("Enter the value of celsius:");
        double celsius = s.nextDouble();

        System.out.println("Enter the value of pounds:");
        double pounds = s.nextDouble();

        System.out.println("Enter the value of kilograms:");
        double kilograms = s.nextDouble();

        System.out.println("Enter the value of gallons:");
        double gallons = s.nextDouble();

        System.out.println("Enter the value of liters:");
        double liters = s.nextDouble();

        System.out.println(fahrenheit + "°F = " + convertFahrenheitToCelsius(fahrenheit) + "°C");
        System.out.println(celsius + "°C = " + convertCelsiusToFahrenheit(celsius) + "°F");
        System.out.println(pounds + " lbs = " + convertPoundsToKilograms(pounds) + " kg");
        System.out.println(kilograms + " kg = " + convertKilogramsToPounds(kilograms) + " lbs");
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
