package Problems;

import Helper.BinaryTreeNode;

import java.util.Stack;

public class ValidateBST {
    public static boolean isValidBST(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        int prev = Integer.MIN_VALUE;

        // This while loop continues as long as there are nodes on the stack or the current node is not null.
        // This ensures that we visit every node in the tree.
        while (!stack.isEmpty() || root != null) {
            // This nested while loop visits the left subtree of the current node.
            // It pushes each node it visits onto the stack and moves to the left child of the current node.
            // When it can't go left anymore (i.e., root is null), it breaks out of this loop.
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // This line checks if the current node's value is less than or equal to the last visited node's value.
            // If it is, it means the binary tree is not a BST, so we return false.
            if (root.val <= prev) {
                return false;
            }
            // This line updates the prev variable to the current node's value. This node is now the last visited node.
            prev = root.val;
            // This line updates the current node to its right child.
            // In the next iteration of the outer while loop, we will visit this right subtree.
            root = root.right;
        }
        return true;
    }

    /*
    public boolean isValidBST2(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        return dfs(root, null, null);
    }

    private boolean dfs(BinaryTreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if ((min != null && root.val <= min) || max != null && root.val >= max) {
            return false;
        }

        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }

     */
}
