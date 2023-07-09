package Problems;

import Helper.BinaryTreeNode;

public class LCAofBT {
    public static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        boolean pInRight = findNode(root.right, p);
        boolean qInRight = findNode(root.right, q);
        boolean pInLeft = findNode(root.left, p);
        boolean qInLeft = findNode(root.left, q);

        if (pInRight && qInRight) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (pInLeft && qInLeft) {
            return lowestCommonAncestor(root.left, p, q);
        }

        return root;
    }

    private static boolean findNode(BinaryTreeNode root, BinaryTreeNode p) {
        if (root == null) {
            return false;
        }
        if (root.val == p.val) {
            return true;
        }

        return findNode(root.left, p) || findNode(root.right, p);
    }

    public static BinaryTreeNode LCAofBToptimum(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }

        BinaryTreeNode left = LCAofBToptimum(root.left, p, q);
        BinaryTreeNode right = LCAofBToptimum(root.right, p, q);

        if (left != null && right != null) {
            return root;
        } else if (left == null && right != null) {
            return right;
        } else if (right == null && left != null) {
            return left;
        } else {
            return null;
        }
    }
}
