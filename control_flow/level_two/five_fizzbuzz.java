package control_flow.level_two;

import java.util.Scanner;

public class five_fizzbuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        int i = 1; // Start from 1
        while (i <= n) {

            
            if (i % 3 == 0 && i % 5 == 0) {        // checking the number is divisible by 5 or 3
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {               // checking the number is divisible by  3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {               // checking the number is divisible by 5 
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++; // Increment i to avoid infinite loop
        }
    }
}
