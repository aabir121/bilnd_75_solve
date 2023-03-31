package com.aabir.binary;

public class SumTwoIntegers {
    private static int getSum(int a, int b) {
        int carry;
        while(b !=0 ) {
            carry = (a&b);
            a = a ^ b;
            b = (carry)<<1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(20,30));
    }
}
