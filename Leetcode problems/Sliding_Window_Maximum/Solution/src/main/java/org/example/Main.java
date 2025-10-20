package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        Solution s = new Solution();
        int[] res = s.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(res)); // [3, 3, 5, 5, 6, 7]
    }
}
