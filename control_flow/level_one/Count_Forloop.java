package control_flow.level_one;

import java.util.Scanner;

public class Count_Forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for countdown start
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println(" Lift off!");

    }
}
