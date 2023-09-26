package Problems;

import Helper.BinaryTreeNode;

/*
The idea is to traverse the tree in a bottom-up manner, calculating the maximum path sum for each subtree while keeping
track of the global maximum path sum encountered so far.

1. The maxPathSum method takes the root node of the binary tree as input and returns the maximum path sum.

2. It initializes the maxSum variable to Integer.MIN_VALUE to track the maximum path sum encountered during the traversal.

3. The calculateMaxPathSum method is a recursive helper function that calculates the maximum path sum for a given node.

4. If the node is null, the method returns 0.

5. The method calculates the maximum sum of the left subtree using a recursive call to calculateMaxPathSum(node.left)
and takes the maximum of it with 0 to handle negative sums.

6. Similarly, it calculates the maximum sum of the right subtree using calculateMaxPathSum(node.right).

7. The current path sum is computed as the sum of the node's value, the maximum sum of the left subtree, and the
maximum sum of the right subtree.

8. The maximum path sum is updated by taking the maximum of the current path sum and the maxSum variable.

9. Finally, the method returns the sum of the node's value and the maximum sum of either the left or right subtree (whichever is greater).
 */
public class MaximumPathSumBT {
    private static int maxSum;

    public static int maxSum(BinaryTreeNode root) {
        maxSum = Integer.MIN_VALUE;
        calculateMaxPathSum(root);
        return maxSum;
    }

    private static int calculateMaxPathSum(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }

        // Calculate the maximum path sum for the left and right subtrees while ensuring non-negativity
        int leftSum = Math.max(calculateMaxPathSum(node.left), 0);
        int rightSum = Math.max(calculateMaxPathSum(node.right), 0);

        // Calculate the path sum that includes the current node
        int currentPathSum = node.val + leftSum + rightSum;
        // Update the global maxSum with the maximum path sum encountered so far
        maxSum = Math.max(maxSum, currentPathSum);

        // Return the maximum path sum that can be extended to the parent node i.e. keep going up
        return node.val + Math.max(leftSum, rightSum);
    }
}