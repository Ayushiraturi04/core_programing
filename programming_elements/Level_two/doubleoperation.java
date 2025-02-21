package Level_two;

import java.util.*;

public class doubleoperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking double input
        System.out.print("Enter first double (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter second double (b): ");
        double b = scanner.nextDouble();
        System.out.print("Enter third double (c): ");
        double c = scanner.nextDouble();

        // Performing double operations
        double result1 = a + b * c; // Multiplication (*) first, then addition (+)
        double result2 = a * b + c; // Multiplication (*) first, then addition (+)
        double result3 = c + a / b; // Division (/) first, then addition (+)
        double result4 = a % b + c; // Modulus (%) first, then addition (+)

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3
                + ", and " + result4);

    }
}
