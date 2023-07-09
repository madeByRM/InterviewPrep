package Problems;

import Helper.BinaryTreeNode;

public class SubtreeOfAnotherTree {
    public static boolean isSubtree(BinaryTreeNode root, BinaryTreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (areTreesSame(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean areTreesSame(BinaryTreeNode node1, BinaryTreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if ((node1 != null && node2 == null) || (node1 == null && node2 != null)) {
            return false;
        } else if (node1.val != node2.val) {
            return false;
        }
        return areTreesSame(node1.left, node2.left) && areTreesSame(node1.right, node2.right);
    }
}
