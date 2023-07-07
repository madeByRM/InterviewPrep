package Helper;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) { root = new BinaryTreeNode((data)); }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private BinaryTreeNode insertNode(BinaryTreeNode curr, int data) {
        if (curr == null) {
            return new BinaryTreeNode(data);
        }

        if (data < curr.val) {
            curr.left = insertNode(curr.left, data);
        } else if (data > curr.val) {
            curr.right = insertNode(curr.right, data);
        }

        return curr;
    }

    public void printInOrder() {
        printInOrderTraversal(root);
    }

    private void printInOrderTraversal(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        printInOrderTraversal(node.left);
        System.out.println(node.val + " ");
        printInOrderTraversal(node.right);
    }

    // Method to print the binary tree with visualization
    public void printTree() {
        List<List<String>> treeLines = new ArrayList<>();
        constructTreeLines(root, 0, treeLines);
        for (List<String> line : treeLines) {
            for (String element : line) {
                System.out.print(" " + element + " ");
            }
            System.out.println();
        }
    }

    // Recursive method to construct lines for tree visualization
    private void constructTreeLines(BinaryTreeNode node, int level, List<List<String>> treeLines) {
        if (node == null) {
            return;
        }

        if (treeLines.size() <= level) {
            treeLines.add(new ArrayList<>());
        }

        constructTreeLines(node.left, level + 1, treeLines);

        String dataString = String.valueOf(node.val);
        treeLines.get(level).add(dataString);

        constructTreeLines(node.right, level + 1, treeLines);
    }

    public BinaryTreeNode getRoot(){
        return root;
    }
}
