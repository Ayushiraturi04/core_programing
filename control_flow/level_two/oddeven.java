package control_flow.level_two;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter a number input: ");
        int number = s.nextInt();

        // check number is natural or not
        if (number > 0) {

            // iterate from 1 to number
            for (int i = 1; i < number; i++) {
            }

            // check number is odd or even
            if (number % 2 == 0) {

                System.out.println("The number is even ");
            } else {

                System.out.println("The number is odd ");
            }
        }
    }
}
