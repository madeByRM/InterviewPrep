package Problems;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word) {
        // Initialize a variable node to the root of the Trie.
        // This variable will be used to traverse the Trie as we insert characters.
        TrieNode node = root; // Start at the root node

        // Convert the input word into a character array for easy iteration.
        for (char c : word.toCharArray()) {
            // Calculate the index based on character 'a'.
            // For example, if c is 'a', index will be 0; if c is 'b', index will be 1, and so on.
            int index = c - 'a';
            // Check if the current character's node does not exist in the Trie.
            if (node.children[index] == null) {
                // If it doesn't exist, create a new TrieNode for the character.
                node.children[index] = new TrieNode();
            }
            // Move the node to the child node corresponding to the current character. i.e. looping down to nodes
            node = node.children[index];
        }
        // After inserting all characters of the word, mark the last node as the end of the word.
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }


    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }
}

class TrieNode {
    public TrieNode[] children; // Array to store child nodes for each character (a-z)
    public boolean isEndOfWord; // Indicates if the current node marks the end of a word

    public TrieNode() {
        children = new TrieNode[26]; // Assuming lowercase English letters
        isEndOfWord = false; // Initialize as not the end of a word
    }
}
