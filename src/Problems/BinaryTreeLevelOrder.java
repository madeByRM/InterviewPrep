package Problems;

import Helper.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {
    public static List<List<Integer>> traverse(BinaryTreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            answer.add(new ArrayList<>());
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                BinaryTreeNode current = queue.remove();
                answer.get(level).add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            level++;
        }
        return answer;
    }
}
