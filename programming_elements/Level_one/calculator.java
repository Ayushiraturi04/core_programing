package Level_one;

import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // taking input for number 1;
        System.out.println("Enter the value of number1 : ");
        float number1 = s.nextInt();

        // taking input for number 2;
        System.out.println("Enter the value of number2 : ");
        float number2 = s.nextInt();

        // add two numbers
        float add = number1 + number2;

        // substract two numbers
        float substract = number1 - number2;

        // multiple two numbers
        float multiple = number1 * number2;

        // division of two number
        float division = number1 / number2;

        System.out
                .println(
                        "The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and "
                                + number2 + " is " + add + ", " + substract + ", " + multiple + " and " + division);

    }
}
