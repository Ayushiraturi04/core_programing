import java.util.Scanner;

public class Toggle_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Initialize an empty string to store the toggled case result
        String result = "";

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // If the character is uppercase, convert it to lowercase
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch); // Add the lowercase character to the result
            }
            // If the character is lowercase, convert it to uppercase
            else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch); // Add the uppercase character to the result
            }
            // If the character is neither uppercase nor lowercase (e.g., punctuation), keep
            // it as it is
            else {
                result += ch;
            }
        }

        // Print the modified string with toggled case
        System.out.println("Toggled string: " + result);
    }
}