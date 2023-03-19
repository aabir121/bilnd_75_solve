package com.aabir.arrays;

import com.aabir.utils.Utils;

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 1) {
            return profit;
        }

        int min = prices[0];
        for (int i = 1; i< prices.length; i++) {
            if (prices[i] - min < 0) {
                min = prices[i];
            } else if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
