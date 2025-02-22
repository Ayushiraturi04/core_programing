package Problem_Statement2;

import java.util.Scanner;
import java.util.Random;

public class Number_guessing_Game {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100, and I will guess it!");
        playGame(); // Start the game
    }

    // Main game logic
    public static void playGame() {
        int low = 1, high = 100; // Define the range of numbers
        int guess;
        String feedback;

        while (true) {
            guess = generateGuess(low, high); // Generate a new guess
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'):");
            feedback = scanner.next().toLowerCase(); // Get user feedback

            if (feedback.equals("correct")) { // If the guess is correct
                System.out.println("Yay! I guessed your number.");
                break; // Exit the loop
            } else if (feedback.equals("high")) {
                high = guess - 1; // Adjust the upper bound
            } else if (feedback.equals("low")) {
                low = guess + 1; // Adjust the lower bound
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }

            // If the range becomes invalid, restart the game
            if (low > high) {
                System.out.println("Oops! There seems to be an error. Let's start over.");
                break;
            }
        }
    }

    // Function to generate a random guess within the given range
    public static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1); // Generate a number between low and high
    }
}
