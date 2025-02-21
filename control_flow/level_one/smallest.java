package control_flow.level_one;

import java.util.*;

public class smallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // taking 3 numbers input
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int number3 = s.nextInt();

        // Checking the smallest number
        boolean smallestnum = (number1 < number2) && (number1 < number3);
        System.out.print("Is the first number the smallest? " + smallestnum);

    }
}
