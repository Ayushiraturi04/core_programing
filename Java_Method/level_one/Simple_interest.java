package level_one;

import java.util.Scanner;

public class Simple_interest {

    // Method to calculate the Simple Interest
    static double Simple_interest(int principal, int rate, int time) {

        // Return the value
        return (double) principal * (double) rate * (double) time / 100;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Taking user input

        // User input for Principal
        System.out.println("Enter the value of principal:");
        int principal = s.nextInt();

        // User input for Rate
        System.out.println("Enter the value of rate:");
        int rate = s.nextInt();

        // User input for Time
        System.out.println("Enter the value of time:");
        int time = s.nextInt();

        // Store the value of Simple Interest
        double si = Simple_interest(principal, rate, time);

        System.out.println(si);
    }
}
