package level_one;

import java.util.Scanner;

public class meanheight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the user input
        double[] heights = new double[11];

        // Initialise the sum
        double sum = 0.0;

        // Find the sum of elements present in array
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;
        System.out.println("Mean height of football team: " + mean);


    }
}
