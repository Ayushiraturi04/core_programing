package Level_one;

import java.util.*;

public class unitprice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // taking input for price
        System.out.println("Enter the value of unitprice");
        int unitprice = s.nextInt();
        // taking input for price
        System.out.println("Enter the quantity");
        int quantity = s.nextInt();
        int total = unitprice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity
                + " and unit price is INR " + unitprice);
    }
}
