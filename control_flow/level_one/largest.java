package control_flow.level_one;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // taking 3 numbers as input
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int number3 = s.nextInt();

        // check which is largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        System.out.println("Is the first number the largest? " + number1);
        System.out.println("Is the second number the largest? " + number2);
        System.out.println("Is the third number the largest? " + number3);

    }
}
