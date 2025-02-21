package control_flow.level_two;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // taking user input
        int number = s.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // check number is divisible by i or not
                System.out.println(i);
            }
        }
    }
}
