package com.aabir.binary;

public class NumberOneBits {
    private static int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            n= n & (n-1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(0b11111111111111111111111111111101));
    }
}
