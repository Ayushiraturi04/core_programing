package level_one;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a text
        System.out.println("Enter the text: ");
        String text = sc.nextLine(); // Read the text input from the user

        // Call compareStrings to check if the input text is in lowercase and print the
        // result
        // Convert the text to lowercase using toLowerCase method and the custom
        // convertToLowerCase method
        System.out.println("Is the text in lowercase? " + compareStrings(text.toLowerCase(), convertToLowerCase(text)));
    }

    // Method to convert a given text to lowercase manually (without using built-in
    // toLowerCase)
    public static String convertToLowerCase(String text) {
        String result = ""; // Initialize an empty string to store the result

        // Loop through each character of the input string
        for (int i = 0; i < text.length(); i++) {
            // Check if the character is an uppercase letter (A-Z)
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                // Convert the character to lowercase by adding 32 to its ASCII value
                result += (char) (text.charAt(i) + 32);
            } else {
                // If it's already lowercase or not a letter, add the character as is
                result += text.charAt(i);
            }
        }
        return result; // Return the converted string
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        // First, check if the lengths of the two strings are different
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, the strings are not equal
        }

        // Loop through each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            // Compare characters at the same position in both strings
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, the strings are not equal
            }
        }

        // If all characters match, return true
        return true;
    }
}
