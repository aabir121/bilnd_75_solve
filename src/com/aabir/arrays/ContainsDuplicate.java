package com.aabir.arrays;

import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        var set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return nums.length != set.size();
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));

    }
}
