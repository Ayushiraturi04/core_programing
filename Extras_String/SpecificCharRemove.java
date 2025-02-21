import java.util.Scanner;

public class SpecificCharRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Taking the character to remove from the user
        System.out.println("Enter a character to remove: ");
        char ch = sc.next().charAt(0); // Read the first character of the input string

        // Initialize an empty result string to store the modified string
        String result = "";

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // If the current character is not the one to be removed, add it to the result
            if (str.charAt(i) != ch) {
                result += str.charAt(i); // Append the character to the result
            }
        }

        // Print the modified string with the specified character removed
        System.out.println("Modified string: " + result);
    }
}
