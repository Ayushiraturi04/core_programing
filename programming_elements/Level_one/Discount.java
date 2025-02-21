package Level_one;

import java.util.*;

public class Discount {
    public static void main(String[] args) {
        int fee = 125000;
        int discount_percentage = 10;

        // Discount
        int discount = fee / discount_percentage;

        // After discount;
        int totalfee = fee - discount;
        System.out
                .println("The discount amount is INR : " + discount + " and final discounted fee is INR: " + totalfee);
    }
}
