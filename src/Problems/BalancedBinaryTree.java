package Problems;

import Helper.BinaryTreeNode;

public class BalancedBinaryTree {
    public static boolean isBalanced(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            return isBalanced(root.right) && isBalanced(root.left);
        }
    }

    private static int getHeight(BinaryTreeNode root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
