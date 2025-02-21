package level_two;

import java.util.Scanner;

public class Shortest_longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "); // Prompt user for input
        String str = sc.nextLine(); // Read the input string
        String[] words = splitWords(str); // Split the string into words
        String[][] wordsLength = splitWordsLength(words); // Store words with their lengths
        int[] shortLong = findShortLong(wordsLength); // Find the shortest and longest words

        // Display shortest and longest words
        System.out.println("Shortest word: " + words[shortLong[0]]);
        System.out.println("Longest word: " + words[shortLong[1]]);
    }

    public static String[] splitWords(String str) {
        return str.split(" "); // Split the input string into words using space as a delimiter
    }

    public static String[][] splitWordsLength(String[] words) {
        String[][] wordsLength = new String[words.length][2]; // Create a 2D array to store words and their lengths
        for (int i = 0; i < words.length; i++) {
            wordsLength[i][0] = words[i]; // Store word
            wordsLength[i][1] = String.valueOf(words[i].length()); // Store word length
        }
        return wordsLength;
    }

    public static int[] findShortLong(String[][] wordsLength) {
        int[] shortLong = new int[2]; // Array to store indices of shortest and longest words
        shortLong[0] = 0; // Initialize shortest word index
        shortLong[1] = 0; // Initialize longest word index

        for (int i = 1; i < wordsLength.length; i++) {
            int currentLength = Integer.parseInt(wordsLength[i][1]); // Current word length
            int shortLength = Integer.parseInt(wordsLength[shortLong[0]][1]); // Shortest word length
            int longLength = Integer.parseInt(wordsLength[shortLong[1]][1]); // Longest word length

            if (currentLength < shortLength) {
                shortLong[0] = i; // Update shortest word index
            }
            if (currentLength > longLength) {
                shortLong[1] = i; // Update longest word index
            }
        }
        return shortLong;
    }
}
