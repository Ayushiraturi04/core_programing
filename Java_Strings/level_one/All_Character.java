package level_one;

import java.util.Arrays;
import java.util.Scanner;

public class All_Character {

    // Method to return characters of a string as an array without using
    // toCharArray()
    public static char[] getCharacters(String text) {
        char[] array = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            array[i] = text.charAt(i);
        }
        return array;
    }

    // Method to compare two character arrays
    public static boolean comparison(char arr1[], char arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = s.nextLine();

        // Using user-defined method
        char use[] = getCharacters(text);

        // Using built-in toCharArray() method
        char builtArr[] = text.toCharArray();

        // Comparing both arrays
        boolean areEqual = comparison(builtArr, use);

        // Displaying results
        System.out.println("Characters using user-defined method: " + Arrays.toString(use));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(builtArr));
        System.out.println("Are both character arrays equal: " + areEqual);

    }
}
