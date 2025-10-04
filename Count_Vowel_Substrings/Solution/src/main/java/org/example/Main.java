package org.example;

public class Main {
    public static void main(String[] args) {
        String[] tests = {
                "aeiouu",        // 2
                "unicornarihan", // 0
                "cuaieuouac",    // 7
                "a",             // 0
                "aeiou",         // 1
                "aaeeiioouu",    // many; still valid
                "bcdaeioxyzou",  // 0 (consonants break)
                "aeioxxu",       // 0 (break before all 5)
                "eaiou",         // 1 (any order)
                "cuaieouuac"     // similar to example
        };

        for (String w : tests) {
            int ans = Solution.countVowelSubstrings(w);
            System.out.printf("Input: %-12s -> %d%n", w, ans);
        }
    }
}
