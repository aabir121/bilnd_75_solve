package com.aabir.arrays;

import com.aabir.utils.Utils;

import java.util.HashMap;

public class TwoSumSolution {
    public static int[] TwoSum(int[] nums, int target) {
        var prev = new HashMap<Integer, Integer>();
        int[] result = null;
        prev.put(nums[0], 0);
        for (int i = 1; i< nums.length; i++) {
            var rem = target - nums[i];
            if (prev.containsKey(rem)) {
                result = new int[]{prev.get(rem), i};
            } else {
                prev.put(nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Utils.print(TwoSum(new int[]{2,7,11,15}, 9));
        Utils.print(TwoSum(new int[]{3,2,4}, 6));
        Utils.print(TwoSum(new int[]{3,3}, 6));
    }
}
