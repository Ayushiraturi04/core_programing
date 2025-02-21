package level_three;

import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for user input

        // Prompt the user to enter a text
        System.out.println("Enter the text");
        String text = sc.nextLine();

        // Call function to find the first non-repeating character
        char result = findNonRepeating(text);

        // Display the result
        if (result != ' ') {
            System.out.println("First non-repeating character in the text is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    // Function to find the first non-repeating character in a given text.

    public static char findNonRepeating(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Count occurrences of each character in the text
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return ' '; // Return space if no unique character is found
    }
}