package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] nums = {2,-3,4,-2,2,1,-1,4};
       Solution s = new Solution();
       System.out.println(s.maxSubArray(nums));
    }
}