package level_three;

import java.util.Random;

public class tallest_shortest {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size]; // Create an array to store heights
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // Generate a random height in the range 150-250 cm
        }
        return heights; // Return the generated heights array
    }

    // Method to calculate the sum of all elements in the heights array
    public static int calculateSum(int[] heights) {
        int sum = 0; // Initialize sum variable
        for (int height : heights) { // Iterate through each height
            sum += height; // Add each height to the sum
        }
        return sum; // Return the total sum
    }

    // Method to calculate the mean (average) height
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length; // Compute mean using sum/number of elements
    }

    // Method to find the shortest player's height
    public static int findShortest(int[] heights) {
        int min = heights[0]; // Assume the first height is the shortest
        for (int height : heights) { // Iterate through all heights
            if (height < min) { // If a smaller height is found
                min = height; // Update the shortest height
            }
        }
        return min; // Return the shortest height
    }

    // Method to find the tallest player's height
    public static int findTallest(int[] heights) {
        int max = heights[0]; // Assume the first height is the tallest
        for (int height : heights) { // Iterate through all heights
            if (height > max) { // If a greater height is found
                max = height; // Update the tallest height
            }
        }
        return max; // Return the tallest height
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11); // Create an array of 11 players' heights

        // Display the generated heights
        System.out.print("Players' Heights: ");
        for (int height : heights) {
            System.out.print(height + " cm "); // Print each height in cm
        }
        System.out.println(); // Print a new line

        // Calculate required values
        int sum = calculateSum(heights); // Calculate total sum of heights
        double mean = calculateMean(heights); // Calculate the mean height
        int shortest = findShortest(heights); // Find the shortest player's height
        int tallest = findTallest(heights); // Find the tallest player's height

        // Display results
        System.out.println("Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Player Height: " + shortest + " cm");
        System.out.println("Tallest Player Height: " + tallest + " cm");
    }
}
