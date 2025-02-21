package level_one;

import java.util.Scanner;

public class Illegal_argu {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a text
        System.out.println("Enter the text: ");
        String text = sc.next(); // Read the text input from the user

        // Call method to generate an exception (invalid substring range)
        generateException(text);

        // Call method to handle the exception and demonstrate error handling
        handleException(text);
    }

    // Method to generate an exception by providing invalid substring indices
    public static void generateException(String text) {
        // Attempt to get a substring from index 5 to index 2, which is invalid and will
        // throw an exception
        System.out.println(text.substring(5, 2));
    }

    // Method to handle exceptions using try-catch block
    public static void handleException(String text) {
        try {
            // Try to get the invalid substring again, which will throw an
            // IllegalArgumentException
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            // Catch the IllegalArgumentException and print a message
            System.out.println("IllegalArgumentException caught");
        } catch (Exception e) {
            // Catch any other exception and print a generic message
            System.out.println("Exception caught");
        }
    }
}