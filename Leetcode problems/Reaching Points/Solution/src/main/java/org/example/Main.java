package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reachingPoints(1,1,3,5)); //should print true
        System.out.println(s.reachingPoints(1,1,2,2)); //should print false
        System.out.println(s.reachingPoints(1,1,1,1)); //should print true
    }
}