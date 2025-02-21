package level_two;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter a string: "); // Prompt the user to enter a string
        String str = sc.next(); // Read the input string (only first word)

        // Display string length using built-in method
        System.out.println("Length of the string using built-in method: " + str.length());

        // Display string length using user-defined method
        System.out.println("Length of the string using user-defined method: " + findLength(str));
    }

    // Method to find the length of a string without using built-in methods
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Try accessing characters one by one
                count++; // Increment counter
            }
        } catch (Exception e) { // Catch exception when index goes out of bounds
            return count; // Return the counted length
        }
    }
}
