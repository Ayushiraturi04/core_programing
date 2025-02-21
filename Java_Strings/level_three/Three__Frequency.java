package level_three;

import java.util.Scanner;

public class Three__Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.println("Enter the text");
        String text = sc.nextLine();

        // Get the character frequencies
        String[][] result = findFrequency(text);

        // Display character frequencies
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            // Use .equals() to compare strings instead of "!="
            if (!result[i][1].equals("0")) {
                System.out.println(result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }

    // Function to compute the frequency of each character
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // 2D String array to store characters and their frequency
        String[][] result = new String[256][2];

        // Populate the result array
        for (int i = 0; i < 256; i++) {
            result[i][0] = Character.toString((char) i); // Store character as a string
            result[i][1] = Integer.toString(frequency[i]); // Convert frequency to string
        }
        return result;
    }
}