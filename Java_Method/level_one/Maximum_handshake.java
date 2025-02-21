package level_one;

import java.util.Scanner;

public class Maximum_handshake {

    // Method to use the combination formula
    static int Maximum_handshake(int num_students) {
        return (num_students * (num_students - 1) / 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Enter the number of students;
        int num_students = s.nextInt();

        // Combination formula for handshake
        int max_handshake = (num_students * (num_students - 1) / 2);

        System.out.println(max_handshake);
    }
}
