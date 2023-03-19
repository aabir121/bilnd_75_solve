package com.aabir.utils;

import java.util.Arrays;

public class Utils {
    public static void print(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("None");
            return;
        }

        Arrays.stream(nums).forEach(System.out::println);
    }
}
