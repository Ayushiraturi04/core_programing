package level_one;

import java.util.Scanner;

public class Substring {

    // Method to create a substring using charAt()
    public static String createSubString(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareSubstrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = s.nextLine(); // Read the string

        System.out.print("Enter start index: ");
        int start = s.nextInt(); // Read start index

        System.out.print("Enter end index: ");
        int end = s.nextInt(); // Read end index

        // Create substring using charAt() method
        String subStringCharAt = createSubString(text, start, end);

        // Create substring using built-in substring() method
        String subStringBuiltIn = text.substring(start, end);

        // Compare both substrings
        boolean areEqual = compareSubstrings(subStringCharAt, subStringBuiltIn);

        // Print results
        System.out.println("Substring using charAt(): " + subStringCharAt);
        System.out.println("Substring using built-in method: " + subStringBuiltIn);
        System.out.println("Are both substrings equal: " + areEqual);

    }
}
