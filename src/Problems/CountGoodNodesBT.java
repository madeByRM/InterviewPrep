package Problems;

import Helper.BinaryTreeNode;

/*
The solution to this problem is straightforward using Depth-First Search (DFS).
We initialize a variable 'maxSoFar' with the minimum possible integer value.

For each visited node in the tree, we update 'maxSoFar' to have the maximum value between the 'maxSoFar' and the value of the current node.
Plus one to the count of goodNodes if the current node is a good node, i.e., if the value is more than or equal to 'maxSoFar'.

Recurse this process for the left and the right child of each node to make sure all nodes get checked for "good" condition.
 */
public class CountGoodNodesBT {
    // Public function to count good nodes in the binary tree
    public static int goodNodes(BinaryTreeNode root) {
        // Initialize the count by calling the helper function with an initial maximum value
        return countGoodNodes(root, Integer.MIN_VALUE);
    }

    // Helper function for counting good nodes recursively
    private static int countGoodNodes(BinaryTreeNode root, int maxSoFar) {
        // Base case: If the current node is null, return 0 (no nodes to process)
        if (root == null) {
            return 0;
        }

        // Initialize a count variable to keep track of good nodes
        int count = 0;

        // Check if the current node is a "good" node (value greater than or equal to maxSoFar)
        if (root.val >= maxSoFar) {
            count++;          // Increment the count
            maxSoFar = root.val; // Update the maximum value encountered along the path
        }

        // Recursively count good nodes in the left and right subtrees
        count += countGoodNodes(root.left, maxSoFar);  // Left subtree
        count += countGoodNodes(root.right, maxSoFar); // Right subtree

        // Return the total count of good nodes in the current subtree
        return count;
    }
}