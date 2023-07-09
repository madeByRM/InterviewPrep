package Problems;

import Helper.BinaryTreeNode;

public class MaximumDepthBT {
    public static int maxDepth(BinaryTreeNode node) {
        return getDepth(node);
    }

    private static int getDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
