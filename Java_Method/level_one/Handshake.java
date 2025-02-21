package level_one;

import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Take the number of students
        System.out.println("enter the number of students:");
        int number = s.nextInt();

        // Calculate the number of handshake
        int handshake = (number * (number - 1) / 2);

        System.out.println(handshake);
    }
}
