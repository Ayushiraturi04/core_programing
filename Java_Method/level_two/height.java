package level_two;

import java.util.Scanner;

public class height {

    // Method to find the youngest friend based on age
    public static String findYoungest(String[] names, int[] ages) {
        int minIndex = 0; // Initialize index for the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) { // Check if current age is smaller
                minIndex = i; // Update index of the youngest friend
            }
        }
        return names[minIndex] + " is the youngest.";
    }

    // Method to find the tallest friend based on height
    public static String findTallest(String[] names, double[] heights) {
        int maxIndex = 0; // Initialize index for the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) { // Check if current height is greater
                maxIndex = i; // Update index of the tallest friend
            }
        }
        return names[maxIndex] + " is the tallest.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of names for the three friends
        String[] names = { "Amar", "Akbar", "Anthony" };

        // Arrays to store ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt(); // Store age in the ages array

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble(); // Store height in the heights array
        }

        // Finding and displaying the youngest and tallest friend
        System.out.println("\n" + findYoungest(names, ages)); // Calls method to find youngest
        System.out.println(findTallest(names, heights)); // Calls method to find tallest

    }
}
