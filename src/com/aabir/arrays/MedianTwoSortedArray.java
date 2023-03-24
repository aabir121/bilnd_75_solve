package com.aabir.arrays;

public class MedianTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0 , j = 0, k = 0;
        int len = nums1.length + nums2.length;
        int mid = len/2;

        int[] merged = new int[len];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }

            if (k == len / 2) {
                return len % 2 == 0 ? (double)(merged[mid] + merged[mid-1]) / 2 : (double) merged[mid];
            }

            k++;
        }

        if (i == nums1.length && j != nums2.length) {
            while(j< nums2.length) {
                merged[k] = nums2[j];
                if (k == len / 2) {
                    return len % 2 == 0 ? (double)(merged[mid] + merged[mid-1]) / 2 : (double) merged[mid];
                }
                j++;
                k++;
            }
        } else if ( j == nums2.length && i != nums1.length) {
            while(i< nums1.length) {
                merged[k] = nums1[i];
                if (k == len / 2) {
                    return len % 2 == 0 ? (double)(merged[mid] + merged[mid-1]) / 2 : (double) merged[mid];
                }
                i++;
                k++;
            }
        }

        return len % 2 == 0 ? (double)(merged[mid] + merged[mid-1]) / 2 : (double) merged[mid];
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
