package level_one;

import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        // Classifying numbers
        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " is Positive and " + (num % 2 == 0 ? "Even" : "Odd"));
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Comparing first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than last element.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }

    }
}
