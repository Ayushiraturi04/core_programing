package level_one;

import java.util.Scanner;

public class Compare_two_String {
    // Method to compare two strings character by character using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, strings are not equal
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character doesn't match, return false
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter first string: ");
        String str1 = s.next();

        System.out.print("Enter second string: ");
        String str2 = s.next();

        // Compare using charAt() method
        boolean charAtComparison = compareUsingCharAt(str1, str2);

        // Compare using built-in equals() method
        boolean equalsComparison = str1.equals(str2);

        // Display results
        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsComparison);

        // Verify if both methods give the same result
        if (charAtComparison == equalsComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
    }
}
