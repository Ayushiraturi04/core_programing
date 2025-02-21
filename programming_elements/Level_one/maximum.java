package Level_one;

import java.util.*;

public class maximum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // taking number of student as input
        System.out.print("Enter the number of student: ");
        int numberOfstudent = s.nextInt();
        // Check the maximum number of Handshake
        int maxhandshake = (numberOfstudent * (numberOfstudent - 1)) / 2;
        System.out.println("The total number of student is: " + numberOfstudent
                + " and the maximum number of handshake is: " + maxhandshake);
    }
}
