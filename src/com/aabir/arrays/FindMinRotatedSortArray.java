package com.aabir.arrays;

public class FindMinRotatedSortArray {
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }

    public static void main (String[] args) {
//        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
    }
}
