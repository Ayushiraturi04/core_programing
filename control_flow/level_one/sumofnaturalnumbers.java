package control_flow.level_one;

import java.util.*;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking user input
        int n = s.nextInt();
        int sum = 0;
        int sumofnum = 0;
        // Check number is natural or not
        if (n <= 0) {
            System.out.print("It is a natural number");
        }

        // Finding sum using for loop
        int sumForLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumForLoop += i;
        }

        // Finding sum using formula
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sumForLoop);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare the sum of both's
        if (sumForLoop == sumFormula) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }
    }

}
