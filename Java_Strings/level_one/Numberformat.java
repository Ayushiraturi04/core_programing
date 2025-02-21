package level_one;

import java.util.Scanner;

public class Numberformat {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a text
        System.out.println("Enter the text: ");
        String text = sc.next(); // Read the text input from the user

        // Call the method to generate an exception (invalid number format)
        generateException(text);

        // Call the method to handle the exception and demonstrate error handling
        handleException(text);
    }

    // Method to generate an exception by trying to parse a non-numeric string as an
    // integer
    public static void generateException(String text) {
        // Attempt to parse the input string to an integer (will throw
        // NumberFormatException if the text is not a valid number)
        System.out.println(Integer.parseInt(text));
    }

    // Method to handle exceptions using try-catch block
    public static void handleException(String text) {
        try {
            // Attempt to parse the input string to an integer
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            // Catch the NumberFormatException if the text cannot be parsed to an integer
            // and print a message
            System.out.println("NumberFormatException caught");
        } catch (Exception e) {
            // Catch any other exception and print a generic message
            System.out.println("Exception caught");
        }
    }
}
