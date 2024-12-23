package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       Solution s = new Solution();
       int nums [] = {1,2,2,3,3,4,3,2,1};
       int k = 2;
        System.out.println(Arrays.toString(s.topKFrequent(nums, k)));
    }
}