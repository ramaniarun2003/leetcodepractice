package org.example;

import java.util.*;

public class Solution {
    // TrieNode class for storing words
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word = null; // Store word at the end node
    }

    // Build Trie from the word list
    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                node.children.putIfAbsent(c, new TrieNode());
                node = node.children.get(c);
            }
            node.word = word; // Mark end of word
        }
        return root;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = buildTrie(words); // Build Trie from words

        // Start DFS from each cell on the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                backtrack(board, i, j, root, result);
            }
        }

        return result;
    }

    private void backtrack(char[][] board, int row, int col, TrieNode parent, List<String> result) {
        char letter = board[row][col];
        TrieNode currentNode = parent.children.get(letter);

        // Stop if the letter is not in the current Trie path
        if (currentNode == null) {
            return;
        }

        // Check if we found a valid word
        if (currentNode.word != null) {
            result.add(currentNode.word);
            currentNode.word = null; // Avoid duplicate entries
        }

        // Mark the current cell as visited
        board[row][col] = '#';

        // Explore all 4 directions
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                backtrack(board, newRow, newCol, currentNode, result);
            }
        }

        // Restore the cell
        board[row][col] = letter;

        // Optimization: Remove leaf nodes from Trie to save space
        if (currentNode.children.isEmpty()) {
            parent.children.remove(letter);
        }
    }
}
