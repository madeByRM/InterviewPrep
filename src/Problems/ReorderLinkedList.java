package Problems;

import Helper.LinkedListNode;

public class ReorderLinkedList {
    public static void reorderLinkedList(LinkedListNode<Integer> head) {
        if (head == null) {
            return;
        }

        // Step 1: Find the middle of the linked list
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by one step
            fast = fast.next.next;    // Move fast pointer by two steps
        }

        // Step 2: Reverse the second half of the linked list
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = slow;
        LinkedListNode<Integer> next;

        while (curr != null) {
            next = curr.next;       // Store the next node
            curr.next = prev;       // Reverse the direction of the next pointer
            prev = curr;            // Move prev pointer forward
            curr = next;            // Move curr pointer forward
        }

        // Step 3: Reorder the linked list
        LinkedListNode<Integer> first = head;
        LinkedListNode<Integer> second = prev;

        while (second!= null && second.next != null) {
            next = first.next;      // Store the next node from the original half
            first.next = second;    // Connect the original half with the reversed half
            first = next;           // Move first pointer forward in the original half

            next = second.next;     // Store the next node from the reversed half
            second.next = first;    // Connect the reversed half with the original half
            second = next;          // Move second pointer forward in the reversed half
        }
    }
}
