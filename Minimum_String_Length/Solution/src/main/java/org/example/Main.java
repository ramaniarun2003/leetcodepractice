package org.example;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        String[] inputs = {
                "AB",        // expect 0
                "AC",        // expect 2
                "ABCD",      // expect 0
                "CABD",      // expect 2
                "ABFCACDB",  // expect 2
                "XYZ",       // expect 3
                "AACCEEFF",  // expect 8
                "A",         // expect 1
                "ACBD",      // expect 4
                "ABABAB",    // expect 0
                "CDCDCD",    // expect 0
                "ABCDABCD",  // expect 0
                "EEEEEEEEEE",// expect 10
                "ABCDABCDABCD" // expect 0
        };

        for (String s : inputs) {
            int result = sol.minLength(s);
            System.out.printf("Input: %-12s -> Output: %d%n", s, result);
        }
    }
}
