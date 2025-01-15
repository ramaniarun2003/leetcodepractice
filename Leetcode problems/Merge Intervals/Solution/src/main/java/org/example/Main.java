package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [][] intervals = {{1,3},{1,5},{6,7}};
        System.out.println(Arrays.deepToString(s.merge(intervals)));
    }
}