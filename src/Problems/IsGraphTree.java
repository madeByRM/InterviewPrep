package Problems;

import java.util.*;

public class IsGraphTree {
    public static boolean validateTree(int n, int[][] edges) {
        if (n == 0) {
            return true;
        }
        /*
        Check for two things
        1. Each node are visited only once
        2. there are no cycles
        */
        List<List<Integer>> adjecencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjecencyList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjecencyList.get(edge[0]).add(edge[1]);
            adjecencyList.get(edge[1]).add(edge[0]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        Set<Integer> seen = new HashSet<>();
        seen.add(0);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            for (int neighbour : adjecencyList.get(currentNode)) {
                if (seen.contains(neighbour)) {
                    return false;
                }
                stack.add(neighbour);
                seen.add(neighbour);
                adjecencyList.get(neighbour).remove(Integer.valueOf(currentNode));
            }
        }
        return (seen.size() == n);
    }
}
