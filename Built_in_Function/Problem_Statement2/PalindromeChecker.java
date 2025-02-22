package Problem_Statement2;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Take input from the user
        String input = takeInput();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display the result
        displayResult(input, isPalindrome);
    }

    // Function to take input from the user
    public static String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        // Convert to lowercase & remove non-alphanumeric characters
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If mismatch found, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If no mismatch, it's a palindrome
    }

    // Function to display the result
    public static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
