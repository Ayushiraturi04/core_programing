package level_one;

import java.util.Scanner;

public class ArrayIndexoutofbound {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to input the number of names
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt(); // Read the number of names from the user

        // Create an array of strings to store the names
        String[] names = new String[n];

        // Loop to get each name from the user
        for (int i = 0; i < n; i++) {
            // Ask the user to enter the name
            System.out.println("Enter name " + (i + 1) + ": ");
            names[i] = sc.next(); // Store each name in the array
        }

        // Call method to generate an exception (accessing out-of-bounds index)
        generateException(names);

        // Call method to handle the exception and demonstrate error handling
        handleException(names);
    }

    // Method to generate an exception by accessing an invalid index
    public static void generateException(String[] names) {
        // Try to access the index out of bounds (this will throw an
        // ArrayIndexOutOfBoundsException)
        System.out.println(names[names.length]);
    }

    // Method to handle exceptions using try-catch block
    public static void handleException(String[] names) {
        try {
            // Try to access the index out of bounds again
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the ArrayIndexOutOfBoundsException and print a message
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (Exception e) {
            // Catch any other exception and print a generic message
            System.out.println("Exception caught");
        }
    }
}
