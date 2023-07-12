package Problems;

import Helper.BinaryTree;
import Helper.BinaryTreeNode;

public class ConstructBinaryTree {

    public static BinaryTreeNode fromPreorderAndInorder(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, inorder, 0, inorder.length - 1);
    }

    /* @param
    preorder: The array representing the preorder traversal of the binary tree.
    preStart: The starting index of the current subtree in the preorder array.
    inorder: The array representing the inorder traversal of the binary tree.
    inStart: The starting index of the current subtree in the inorder array.
    inEnd: The ending index of the current subtree in the inorder array.    */
    private static BinaryTreeNode buildTreeHelper(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd) {
        if (preStart >= preorder.length || inStart > inEnd) {
            return null;
        }

        int rootVal = preorder[preStart];
        BinaryTreeNode root = new BinaryTreeNode(rootVal);
        int rootIndex = 0;

        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        int leftSize = rootIndex - inStart;
        root.left = buildTreeHelper(preorder, preStart + 1, inorder, inStart, rootIndex - 1);
        root.right = buildTreeHelper(preorder, preStart + leftSize + 1, inorder, rootIndex + 1, inEnd);

        return root;
    }
}
