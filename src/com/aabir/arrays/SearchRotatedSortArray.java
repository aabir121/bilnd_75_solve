package com.aabir.arrays;

public class SearchRotatedSortArray {
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        int pivot = 0;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        pivot = start;

        start = 0;
        end = nums.length - 1;

        if (nums[pivot] == target) {
            return pivot;
        } else if (target >= nums[pivot] && target <= nums[end]) {
            start = pivot;
        } else {
            end = pivot;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
//        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 3));
//        System.out.println(search(new int[]{1}, 0));
        System.out.println(search(new int[]{1,3}, 3));

    }
}
