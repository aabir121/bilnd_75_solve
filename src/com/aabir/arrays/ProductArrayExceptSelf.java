package com.aabir.arrays;

import com.aabir.utils.Utils;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prod = 1;
        int end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = prod;
            prod *= nums[i];
        }

        prod = 1;
        for (int i = end; i >= 0; i--) {
            result[i] *= prod;
            prod *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Utils.print(productExceptSelf(new int[]{1,2,3,4}));
        Utils.print(productExceptSelf(new int[]{-1,1,0,-3,3}));
    }
}
