package Problems;

import Helper.BinaryTreeNode;

public class LCAofBST {
    public static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null) {
            return null;
        }

        if (p.val == root.val || q.val == root.val) {
            return root;
        }

        if ((p.val > root.val) && (q.val > root.val)) {
            return lowestCommonAncestor(root.right, p, q);
        }

        if ((p.val < root.val) && (q.val < root.val)) {
            return lowestCommonAncestor(root.left, p, q);
        }

        return root;
    }

//    public static BinaryTreeNode lowestCommonAncestor2(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
//        BinaryTreeNode node = root;
//
//        while (node != null) {
//            if (p.val > node.val && q.val > node.val) {
//                node = node.right;
//            } else if (p.val < node.val && q.val < node.val) {
//                node = node.left;
//            } else {
//                return node;
//            }
//        }
//        return null;
//    }
}
