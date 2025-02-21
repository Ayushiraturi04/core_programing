package control_flow.level_one;

import java.util.Scanner;

public class factorialusingwhileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int factorial = 1;

            for (int i = num; i > 1; i--) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
