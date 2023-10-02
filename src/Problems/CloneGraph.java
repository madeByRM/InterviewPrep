package Problems;

import Helper.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    private static Map<Vertex, Vertex> visited = new HashMap<>();
    public static Vertex cloneGraph(Vertex node) {
       if (node == null) {
           return node;
       }

       if (visited.containsKey(node)) {
           return visited.get(node);
       }

       Vertex clonedNode = new Vertex(node.val, new ArrayList<>());
       visited.put(node, clonedNode);

       for (Vertex neighbor : node.neighbors) {
           // cloneGraph(neighbor) is called, which recursively clones the neighbor node and returns its cloned counterpart.
           // This recursive call is made to ensure that all nodes reachable from the current neighbor are cloned as well,
           // creating a deep copy of the graph.
           clonedNode.neighbors.add(cloneGraph(neighbor));
       }
       return clonedNode;
    }
}
