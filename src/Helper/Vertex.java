package Helper;

import java.util.*;

public class Vertex {
    public int val;
    public List<Vertex> neighbors;

//    public Vertex() {
//        val = 0;
//        neighbors = new ArrayList<>();
//    }

    public Vertex(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }

    public Vertex(int _val, ArrayList<Vertex> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public static void printGraph(Vertex node) {
        if (node == null) {
            return;
        }

        // Use a set to avoid visiting the same node multiple times (in case of cycles)
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        queue.offer(node);
        visited.add(node);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            System.out.print("Node " + current.val + " neighbors: ");

            for (Vertex neighbor : current.neighbors) {
                System.out.print(neighbor.val + " ");
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
            System.out.print(" | ");
        }
    }
}

