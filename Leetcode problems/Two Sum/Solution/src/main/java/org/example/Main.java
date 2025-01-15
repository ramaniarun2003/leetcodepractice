package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {3,4,5,9};
        int target = 7;
        int[] result = s.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}