package control_flow.level_one;

import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a natural number:");
        int naturalnumber = s.nextInt();

        // Check number is greater than 0
        if (naturalnumber > 0) {

            // sum of natural number
            int sum = naturalnumber * (naturalnumber + 1) / 2;
            System.out.println("The sum of " + naturalnumber + " natural numbers is " + sum);
        } else {
            System.out.print("The number" + naturalnumber + "is not a natural number");
        }
    }
}
