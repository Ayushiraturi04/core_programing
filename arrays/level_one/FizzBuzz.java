package level_one;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking User input
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Not a positive integer!");
            return;
        }

        String[] results = new String[number + 1];

        // Checking the conditions
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

    //    Loop for showing the array
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        scanner.close();
    }
}

