package level_two;

import java.util.Scanner;

public class Display_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter a string: "); // Prompt the user to enter a string
        String str = sc.nextLine(); // Read the input string

        // Call method to find vowels and consonants and store the result
        String[][] vowelsConsonants = findVowelsConsonants(str);

        // Call method to display the result
        displayVowelsConsonants(vowelsConsonants);
    }

    // Method to determine if characters in the string are vowels, consonants, or
    // other characters
    public static String[][] findVowelsConsonants(String str) {
        String[][] vowelsConsonants = new String[str.length()][2]; // Create a 2D array to store character and type

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get each character from the string
            vowelsConsonants[i][0] = String.valueOf(ch); // Store the character as a string
            vowelsConsonants[i][1] = isVowel(ch); // Determine if it's a vowel, consonant, or other and store result
        }
        return vowelsConsonants; // Return the populated array
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String isVowel(char ch) {
        if (ch >= 'A' && ch <= 'Z') { // Convert uppercase letters to lowercase
            ch = (char) (ch + 32);
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if ((ch >= 'a' && ch <= 'z')) {
            return "Consonant";
        }
        // If the character is not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to display the characters along with their type
    public static void displayVowelsConsonants(String[][] vowelsConsonants) {
        System.out.println("Character\tType"); // Print table header

        // Iterate through the array and display each character with its classification
        for (String[] character : vowelsConsonants) {
            System.out.println(character[0] + "\t\t" + character[1]);
        }
    }
}
