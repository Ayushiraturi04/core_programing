package control_flow.level_one;

import java.util.*;

public class divisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // taking the number input
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        // checking number is divisible by 5 or not
        boolean divide = (number % 5 == 0);
        System.out.print("Is the number " + number + " divisible by 5? " + divide);
    }

}
