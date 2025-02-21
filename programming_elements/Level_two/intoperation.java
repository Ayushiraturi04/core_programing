package Level_two;

import java.util.Scanner;

public class intoperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter first integer (a): ");
        int a = s.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = s.nextInt();
        System.out.print("Enter third integer (c): ");
        int c = s.nextInt();

        // Performing integer operations
        int result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c; // Multiplication (*) first, then addition (+)
        int result3 = c + a / b; // Division (/) first, then addition (+)
        int result4 = a % b + c; // Modulus (%) first, then addition (+)

        System.out.println(
                "The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}
