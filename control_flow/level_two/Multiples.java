package control_flow.level_two;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Looping from 99 down to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) { // Check if i is a multiple of number
                System.out.print(i + " ");
            }
        }

    }
}
