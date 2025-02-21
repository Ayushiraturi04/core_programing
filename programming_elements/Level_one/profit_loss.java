package Level_one;

import java.util.*;

public class profit_loss {
    public static void main(String[] args) {
        int cost_price = 129;
        int selling_price = 191;

        // find profit and loss
        int profit = selling_price - cost_price;
        int loss = cost_price - selling_price;

        // find profitpercentage and loasspercentage
        float profitpercentage = (float) profit / cost_price * 100;
        float losspercentage = (float) loss / selling_price * 100;

        System.out.println("The Cost Price is INR :" + cost_price + " and Selling Price is INR :" + selling_price);
        System.out.println("The Profit is INR" + profit + " and the Profit Percentage is :" + profitpercentage);
    }
}
