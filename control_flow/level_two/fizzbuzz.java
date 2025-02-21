package control_flow.level_two;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {         // check number is divisible by 5 and 3 
                    System.out.println("FizzBuzz");      
                } else if (i % 3 == 0) {                 // check number is divisible by 3 
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {                 // check number is divisible by 5  
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
