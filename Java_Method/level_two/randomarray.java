package level_two;

import java.util.Arrays;

public class randomarray {
    public static void main(String[] args) {
        int size = 5; // Number of random values to generate

        // Generate an array of 4-digit random numbers
        int[] numbers = generate4DigitRandomArray(size);

        // Calculate average, min, and max values
        double[] results = findAverageMinMax(numbers);

        // Display the generated numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(numbers));
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Generates a 4-digit number (1000 to 9999)
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0; // Variable to store the sum of numbers
        int min = numbers[0], max = numbers[0]; // Initialize min and max with the first element

        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num; // Add each number to sum
            min = Math.min(min, num); // Update min if a smaller number is found
            max = Math.max(max, num); // Update max if a larger number is found
        }

        double average = sum / numbers.length; // Calculate the average
        return new double[] { average, min, max }; // Return results as an array
    }
}
