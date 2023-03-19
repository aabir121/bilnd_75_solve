package com.aabir.arrays;

public class MaxProdSubArray {
    public static int maxProduct(int[] nums) {
        int maxSoFar = nums[0], minSoFar = nums[0], maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int tempMax = Math.max(num, Math.max(maxSoFar * num, minSoFar * num));
            minSoFar = Math.min(num, Math.min(maxSoFar * num, minSoFar * num));
            maxSoFar = tempMax;
            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;
    }

    public static void main (String[] args) {
        System.out.println(maxProduct(new int[]{2,3,-2,4}));
        System.out.println(maxProduct(new int[]{-2,0,-1}));
        System.out.println(maxProduct(new int[]{-2,3,-4}));
    }
}
