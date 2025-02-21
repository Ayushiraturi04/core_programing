package level_one;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        // Compare manually converted uppercase with Java's built-in conversion
        System.out.println("Is the text in uppercase? " + compareStrings(text.toUpperCase(), convertToUpperCase(text)));
    }

    // Method to convert text to uppercase manually
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for better performance
        for (int i = 0; i < text.length(); i++) {
            result.append(Character.toUpperCase(text.charAt(i))); // Use built-in method
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Simplified comparison using equals()
    }
}
