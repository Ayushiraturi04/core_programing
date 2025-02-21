package level_two;

import java.util.Scanner;

public class Consonents_Vowels {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Call the method to count vowels and consonants in the input string
        int[] vowelsConsonants = findVowelsConsonants(str);

        // Output the number of vowels and consonants
        System.out.println("Vowels: " + vowelsConsonants[0]);
        System.out.println("Consonants: " + vowelsConsonants[1]);
    }

    // Method to count vowels and consonants in the input string
    public static int[] findVowelsConsonants(String str) {
        int vowels = 0; // Initialize vowel count
        int consonants = 0; // Initialize consonant count

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at the current position
            // Check if the character is a vowel or consonant
            if (isVowel(ch) == "Vowel") {
                vowels++; // Increment vowel count
            } else if (isVowel(ch) == "Consonant") {
                consonants++; // Increment consonant count
            }
        }

        // Return an array with the counts of vowels and consonants
        return new int[] { vowels, consonants };
    }

    // Method to determine if a character is a vowel, consonant, or not a letter
    public static String isVowel(char ch) {
        // Convert uppercase letters to lowercase to handle case insensitivity
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel"; // Return "Vowel" if it's a vowel
        }
        // Check if the character is a consonant (must be a lowercase letter)
        else if ((ch >= 'a' && ch <= 'z')) {
            return "Consonant"; // Return "Consonant" if it's a consonant
        }
        // Return "Not a Letter" if it's not a valid letter
        else {
            return "Not a Letter";
        }
    }
}
