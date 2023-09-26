package Problems;

import Helper.BinaryTreeNode;

public class ConstructBinaryTree {

    /*
    Level-order: 1 2 3 4 5 6 7 null null null 15 null 8
    Pre-order: 1 2 4 5 15 3 6 8 7
    In-order:  4 2 5 15 1 6 8 3 7
    Note here: 1) First value is root in Pre-order traversal
               2) Left side of root values are in left subtree in In-order traversal
     */
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
        // Base case: If either of these conditions is met, return null,
        // indicating an empty subtree.
        if (preStart >= preorder.length || inStart > inEnd) {
            return null;
        }

        // Extract the value of the root node from the preorder array.
        int rootVal = preorder[preStart];
        BinaryTreeNode root = new BinaryTreeNode(rootVal);
        int rootIndex = 0;

        // Find the index of the root value in the inorder array.
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        // Calculate the size of the left subtree.
        int leftSize = rootIndex - inStart;

        // Recursively construct the left subtree:
        // - Adjust preStart to move to the next element in preorder (the root of left subtree).
        // - Update inStart and inEnd to represent the left subtree in inorder.
        root.left = buildTreeHelper(preorder, preStart + 1, inorder, inStart, rootIndex - 1);
        // Recursively construct the right subtree:
        // - Adjust preStart to skip the left subtree elements.
        // - Update inStart and inEnd to represent the right subtree in inorder.
        root.right = buildTreeHelper(preorder, preStart + leftSize + 1, inorder, rootIndex + 1, inEnd);

        return root;
    }
}
