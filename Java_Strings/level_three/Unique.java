package level_three;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter the text");
        String text = sc.nextLine();

        int length = findLength(text); // Get the length of the text
        char[] unique = findUnique(text); // Find unique characters

        System.out.println("Length of the text is " + length);
        System.out.println("Unique characters in the text are:");

        // Print unique characters
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }

    // Method to find the length of the string
    public static int findLength(String text) {
        int length = 0;

        for (int i = 0; i < text.length(); i++) {
            length++;
        }

        return length;
    }

    // Method to find unique characters in the string
    public static char[] findUnique(String text) {
        char[] result = new char[text.length()];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;

            // Check if the character has already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Add unique character to the result array
            if (isUnique) {
                result[k++] = text.charAt(i);
            }
        }

        // Copy only unique characters to a new array of correct size
        char[] unique = new char[k];
        for (int i = 0; i < k; i++) {
            unique[i] = result[i];
        }

        return unique;
    }
}
