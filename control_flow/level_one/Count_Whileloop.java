package control_flow.level_one;

import java.util.Scanner;

public class Count_Whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for countdown start
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }

        System.out.println(" Lift off!");

    }
}
