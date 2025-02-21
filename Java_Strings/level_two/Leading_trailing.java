package level_two;

import java.util.Scanner;

public class Leading_trailing {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Trim the string using the user-defined method
        String trimmedStr = trim(str);

        // Output the trimmed string using the built-in method
        System.out.println("Trimmed string using built-in method: " + str.trim());

        // Output the trimmed string using the user-defined method
        System.out.println("Trimmed string using user-defined method: " + trimmedStr);

        // Compare the two trimmed strings and print the result
        System.out.println("Are the strings equal? " + compareStrings(trimmedStr, str.trim()));
    }

    // User-defined method to trim the string by finding trim points
    public static String trim(String str) {
        // Find the start and end points for trimming the string
        int[] points = findTrimPoints(str);

        // Return the substring from the start to the end trim points
        return str.substring(points[0], points[1] + 1);
    }

    // Method to find the points to trim the string (start and end of non-space
    // characters)
    public static int[] findTrimPoints(String str) {
        // Initialize start and end indices
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character from the start of the string
        while (str.charAt(start) == ' ') {
            start++;
        }

        // Find the first non-space character from the end of the string
        while (str.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end points as an array
        return new int[] { start, end };
    }

    // Method to compare two strings and check if they are equal
    public static boolean compareStrings(String str1, String str2) {
        // If the lengths of the two strings are not equal, they are not the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Loop through each character and compare them
        for (int i = 0; i < str1.length(); i++) {
            // If any character does not match, return false
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        // If all characters match, return true
        return true;
    }
}
