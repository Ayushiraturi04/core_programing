package Level_two;

import java.util.Scanner;

public class divisionoperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Displaying output
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers "
                + number1 + " and " + number2);

    }
}