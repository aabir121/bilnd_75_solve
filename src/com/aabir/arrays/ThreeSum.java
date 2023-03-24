package com.aabir.arrays;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result.stream().toList();
    }

    public static void main (String[] args) {
        List<List<Integer>> combinations = threeSum(new int[]{-1,0,1,2,-1,-4});
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
