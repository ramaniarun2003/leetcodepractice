package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PrefixTree prefixTree = new PrefixTree();
        prefixTree.insert("cat");
        System.out.println(prefixTree.search("dog"));
        System.out.println(prefixTree.search("cat"));
        System.out.println(prefixTree.startsWith("ca"));
        prefixTree.insert("dog");
        System.out.println(prefixTree.search("do"));
    }
    }
