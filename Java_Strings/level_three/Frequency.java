package level_three;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.println("Enter the text");
        String text = sc.nextLine();

        // Calculate character frequency in the given text
        int[][] result = findFrequency(text);

        // Display character frequencies
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            if (result[i][1] != 0) { // Print only characters that appear in the text
                System.out.println((char) result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }

    // Function to compute the frequency of each character in the given text
    public static int[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of all ASCII characters

        // Count the occurrences of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int[][] result = new int[256][2]; // 2D array to store character and its frequency

        // Store characters and their frequencies in the result array
        for (int i = 0; i < 256; i++) {
            result[i][0] = i; // ASCII value of the character
            result[i][1] = frequency[i]; // Frequency of the character
        }
        return result;
    }
}
