package com.aabir.arrays;

public class FindMinRotatedSortArray2 {
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[start]){
                end = mid;
            } else {
                end -= 1;
            }
        }

        System.gc();

        return nums[start];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{2,2,2,0,1}));
        System.out.println(findMin(new int[]{3,3,1,3}));
        System.out.println(findMin(new int[]{1,3,3}));
    }
}
