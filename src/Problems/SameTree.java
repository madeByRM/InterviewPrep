package Problems;

import Helper.BinaryTreeNode;

public class SameTree {
    public static boolean areTreesSame(BinaryTreeNode node1, BinaryTreeNode node2) {
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
