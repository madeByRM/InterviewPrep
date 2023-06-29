package Problems;

import Helper.BinaryTreeNode;

public class InvertBinaryTree {
    public BinaryTreeNode invertTree(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        BinaryTreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
