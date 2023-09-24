package Problems;

import Helper.LinkedListNode;
import java.util.HashMap;
import java.util.Map;

public class CopyList {
    public static LinkedListNode<Integer> copyRandomList(LinkedListNode<Integer> head) {
        // Step 1: Create a mapping between original nodes and their corresponding copies
        LinkedListNode<Integer> curr = head;
        Map<LinkedListNode<Integer>, LinkedListNode<Integer>> map = new HashMap<>();

        while (curr != null) {
            // Create a new node for the current original node and store it in the map
            map.put(curr, new LinkedListNode<>(curr.value));
            curr = curr.next;
        }

        // Reset the current pointer to the head of the original list
        curr = head;

        // Step 2: Update pointers in the copied nodes
        while (curr != null) {
            // Update the "next" pointer of the copied node to its corresponding copy
            map.get(curr).next = map.get(curr.next);
            // Update the "random" pointer of the copied node to its corresponding copy
            ////////// map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        // Step 3: Return the head of the copied list
        return map.get(head);
    }
}
