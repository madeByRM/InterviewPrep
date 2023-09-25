package Problems;

import Helper.BinaryTreeNode;

public class DiameterBT {
    static int diameter;
    public static int diameterOfBinaryTree(BinaryTreeNode root) {
        diameter = 0;
        dfs(root);
        return diameter;
    }

    private static int dfs (BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        // Calculate the left subtree's depth (not considering the current root).
        int left = dfs(root.left);
        // Calculate the right subtree's depth (not considering the current root).
        int right = dfs(root.right);

        // The diameter at this node is the sum of left and right depths.
        int nodeDiameter = left + right;

        // Update the global diameter if the diameter at this node is greater.
        diameter = Math.max(diameter, nodeDiameter);

        // Return the depth of the current subtree, considering the current root.
        // Adding 1 accounts for the depth of the current node.
        return Math.max(left, right) + 1;
    }
}
