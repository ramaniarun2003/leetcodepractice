package org.example;

// package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        List<int[][]> tests = List.of(
                new int[][]{{0,30},{5,10},{15,20}},                  // 2
                new int[][]{{7,10},{2,4}},                           // 1
                new int[][]{{1,5},{2,6},{3,7},{4,8}},                // 4
                new int[][]{{0,5},{5,10},{10,15}},                   // 1
                new int[][]{{5,10},{0,30},{15,20},{35,40},{25,26}},  // 2
                new int[][]{{0,100},{10,20},{20,30},{30,40},{40,50}},// 2
                new int[][]{{1,3},{1,2},{1,4},{1,5}},                // 4
                new int[][]{{42,43}},                                // 1
                new int[][]{{0,1_000_000},{1,999_999},{2,500_000}},  // 3
                new int[][]{{0,10},{50,60},{55,65},{56,66},{57,67}}  // 4
        );

        int[] expected = {2,1,4,1,2,2,4,1,3,4};

        for (int t = 0; t < tests.size(); t++) {
            int[][] intervals = deepCopy(tests.get(t)); // in case Solution mutates
            int got = sol.minMeetingRooms(intervals);
            System.out.printf(
                    "Test %d: intervals=%s -> got=%d, expected=%d %s%n",
                    t+1, deepToString(tests.get(t)), got, expected[t],
                    got == expected[t] ? "Pass" : "Failed"
            );
        }
    }

    private static String deepToString(int[][] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(Arrays.toString(arr[i]));
            if (i+1 < arr.length) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    private static int[][] deepCopy(int[][] src) {
        int[][] copy = new int[src.length][];
        for (int i = 0; i < src.length; i++) copy[i] = Arrays.copyOf(src[i], src[i].length);
        return copy;
    }
}
