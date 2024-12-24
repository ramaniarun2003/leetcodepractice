package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<String> x = new ArrayList<>();
        x.add("cat");
        x.add("dog");

        String encoded = s.encode(x);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = s.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}