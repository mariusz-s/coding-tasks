package pl.softwarie.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 */
public class ImplementTriePrefixTree {

    private final static int ALPHABET_SIZE = 26;

    private Node root = new Node();

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new Node();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        Node node = findNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    private Node findNode(String prefix) {
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (node.children[c - 'a'] == null) {
                return null;
            } else {
                node = node.children[c - 'a'];
            }
        }
        return node;
    }

    private static class Node {

        public Node[] children = new Node[ALPHABET_SIZE];
        public boolean isWord = false;
    }
}
