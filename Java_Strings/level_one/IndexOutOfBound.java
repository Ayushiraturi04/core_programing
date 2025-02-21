package level_one;

import java.util.Scanner;

public class IndexOutOfBound {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a text
        System.out.println("Enter the text: ");
        String text = sc.next(); // Read the text input from the user

        // Call method to generate an exception (accessing an invalid index)
        generateException(text);

        // Call method to handle the exception and demonstrate error handling
        handleException(text);
    }

    // Method to generate an exception by accessing an invalid index
    public static void generateException(String text) {
        // Try to access the character at an invalid index (length of the string)
        // This will throw StringIndexOutOfBoundsException as the index is out of bounds
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle exceptions using try-catch block
    public static void handleException(String text) {
        try {
            // Try to access the invalid index (this will throw the exception)
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the StringIndexOutOfBoundsException and print a message
            System.out.println("StringIndexOutOfBoundsException caught");
        }
    }
}
