package Level_one;

import java.util.*;

public class universitydiscont {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Taking input for fees
        System.out.print("Enter the fees: ");
        int fee = s.nextInt();
        // input for discount
        System.out.print("Enter the discount%: ");
        int discount_percentage = s.nextInt();

        // Discount
        int discount = fee / discount_percentage;

        // After discount;
        int totalfee = fee - discount;
        System.out
                .println("The discount amount is INR : " + discount + " and final discounted fee is INR: " + totalfee);
    }
}
