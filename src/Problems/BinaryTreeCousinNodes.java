package Problems;

import Helper.BinaryTreeNode;

public class BinaryTreeCousinNodes {
    public static boolean areCousins(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        return ((getLevel(root, node1, 1) == getLevel(root, node2, 1)) && (!areSiblings(root, node1, node2)));
    }

    public static int getLevel(BinaryTreeNode parent, BinaryTreeNode node, int level) {
        if (parent == null) {
            return 0;
        }
        if (parent == node) {
            return level;
        }

        // checks for node in left and right side and returns level
        int leftLevel = getLevel(parent.left, node, level + 1);
        int rightLevel = getLevel(parent.right, node, level + 1);

        if (leftLevel != 0) {
            return leftLevel;
        }
        return rightLevel;
    }

    public static boolean areSiblings(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        if (root == null) {
            return false;
        }
        return ((root.left == node1 && root.right == node2) ||
                (root.left == node2 && root.right == node1) ||
                areSiblings(root.left, node1, node2) ||
                areSiblings(root.right, node1, node2));
    }
}
