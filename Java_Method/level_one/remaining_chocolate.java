package level_one;

import java.util.Scanner;

public class remaining_chocolate {

    // Method to find chocolates each child gets and remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // Quotient
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Remainder

        return new int[] { chocolatesPerChild, remainingChocolates };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check for valid number of children
        if (numberOfChildren == 0) {
            System.out.println("Error: Number of children cannot be zero.");
        } else {
            // Compute chocolates distribution
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display results
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}
