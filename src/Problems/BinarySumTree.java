package Problems;

import Helper.BinaryTreeNode;

/*
The given code is for determining whether a binary tree is a sum tree. A sum tree is a binary tree where the value of
each node is equal to the sum of the values of its left and right children. Here's a step-by-step explanation of the code:

1. The `isSumTree` method takes a `BinaryTreeNode` object as input and returns a boolean value indicating whether
the tree is a sum tree.

2. The base case for a sum tree is when the root is `null` or it has no children (both left and right children are `null`).
In this case, the tree is considered a sum tree, and the method returns `true`.

3. If the base case is not met, the method calculates the sum of the values of the left and right subtrees using the `sum` method.

4. It then checks if the sum of the left and right subtrees, added to the value of the current root, is equal to the
value of the root itself. Additionally, it recursively checks if both the left and right subtrees are also sum trees using the `isSumTree` method.

5. If the conditions for a sum tree are satisfied, the method returns `true`. Otherwise, it returns `false`.

6. The `sum` method is a helper method that calculates the sum of the values of the nodes in a given subtree.

7. It follows a recursive approach by first checking if the root is `null`. If so, it returns 0, indicating an empty subtree.

8. If the root is not `null`, it recursively calculates the sum of the values of the left and right subtrees using the
`sum` method and adds the value of the current root.

9. The method returns the sum of the values of the nodes in the subtree.
 */
public class BinarySumTree {
    public static boolean isSumTree(BinaryTreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return ((root.val == leftSum + rightSum) && isSumTree(root.left) && isSumTree(root.right));
    }

    private static int sum(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        return (sum(root.left) + root.val + sum(root.right));
    }
}
