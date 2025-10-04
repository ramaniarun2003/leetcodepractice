package org.example;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[][] tests = {
                {"ab#c", "ad#c"},    // true
                {"ab##", "c#d#"},    // true
                {"a#c", "b"},        // false
                {"a##c", "#a#c"},    // true
                {"xywrrmp", "xywrrmu#p"} // true
        };

        for (String[] test : tests) {
            boolean result = sol.backspaceCompare(test[0], test[1]);
            System.out.printf("Input: s=\"%s\", t=\"%s\" -> %b%n", test[0], test[1], result);
        }
    }
}
