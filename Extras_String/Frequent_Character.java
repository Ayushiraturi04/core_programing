import java.util.Scanner;

public class Frequent_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Array to store frequency of each character (ASCII values range from 0 to 255)
        int[] freq = new int[256];

        // Loop through each character in the string to calculate its frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++; // Increment the count for each character in the frequency array
        }

        // Variables to track the most frequent character
        int max = -1; // Initialize max frequency as -1
        char result = ' '; // Initialize result as a space character

        // Loop through the string again to find the most frequent character
        for (int i = 0; i < str.length(); i++) {
            // If the current character has a higher frequency than the current max
            if (max < freq[str.charAt(i)]) {
                max = freq[str.charAt(i)]; // Update max frequency
                result = str.charAt(i); // Update the result character
            }
        }

        // Print the most frequent character
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
