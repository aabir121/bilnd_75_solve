package com.aabir.arrays;

public class MaxAreaContainer {
    public static int maxArea(int[] height) {
        int max = 0;
        int j = height.length - 1;
        int i = 0;
        while (i < j) {
            int area = Math.min(height[j], height[i]) * (j - i);
            if (area > max) {
                max = area;
            }

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxArea(new int[]{2,3,4,5,18,17,6}));
    }
}
