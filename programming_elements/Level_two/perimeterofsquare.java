package Level_two;

import java.util.*;

public class perimeterofsquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Enter the side of perimeter
        System.out.println("Enter a side: ");
        int side = s.nextInt();

        // Finding the perimeter of square
        int perimeter = (int) Math.pow(side, 4);
        System.out.println("The length of the side is:" + side + "whose perimeter is: " + perimeter);

    }
}
