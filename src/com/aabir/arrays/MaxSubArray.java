package com.aabir.arrays;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingSoFar = nums[0];

        for (int i =1 ;i< nums.length;i++) {
            maxEndingSoFar = Math.max(nums[i], maxEndingSoFar + nums[i]);
            maxSoFar = Math.max(maxEndingSoFar, maxSoFar);
        }

        return maxSoFar;
    }


    public static void main (String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
