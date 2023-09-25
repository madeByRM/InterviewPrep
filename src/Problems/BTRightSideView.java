package Problems;

import Helper.BinaryTree;
import Helper.BinaryTreeNode;

import java.util.*;

public class BTRightSideView {
    public static List<Integer> rightSideView(BinaryTreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<BinaryTreeNode> q = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int queueSize = q.size();
            for (int i = 0; i < queueSize; i++) {
                BinaryTreeNode curr = q.poll();
                if (i == 0) {
                    answer.add(curr.val);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
                if (curr.left != null) {
                    q.offer(curr.left);
                }
            }
        }
        return answer;
    }
}
