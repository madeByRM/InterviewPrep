package Problems;

import Helper.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementBST {
    public static int kthSmallest(BinaryTreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        inOrderDFS(root, k, ans);
        return ans.get(k - 1);
    }

    private static void inOrderDFS(BinaryTreeNode root, int k, List<Integer> ans) {
        if (root == null || ans.size() >= k) {
            return;
        }
        inOrderDFS(root.left, k, ans);
        if (ans.size() < k) {
            ans.add(root.val);
        }
        inOrderDFS(root.right, k, ans);
    }
}
