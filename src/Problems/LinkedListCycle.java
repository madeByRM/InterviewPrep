package Problems;

import Helper.LinkedListNode;

public class LinkedListCycle {
    public static boolean hasCycle(LinkedListNode<Integer> head) {
        // Check if the linked list is empty or has only one node (no cycle).
        if (head == null || head.next == null) {
            return false;
        }

        // Initialize two pointers: 'slow' and 'fast' to the head of the linked list.
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        // Main loop: Move 'fast' and 'slow' pointers until they meet or 'fast' reaches the end.
        while (fast != null && fast.next != null) {
            // Move 'fast' two steps at a time and 'slow' one step at a time.
            fast = fast.next.next;
            slow = slow.next;

            // If 'fast' and 'slow' pointers meet, a cycle is detected, so return true.
            if (slow == fast) {
                return true;
            }
        }

        // If 'fast' reaches the end (no cycle found), return false.
        return false;
    }
}
