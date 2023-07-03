package Problems;

import Helper.LinkedListNode;

public class ReorderLinkedList {
    public static void reorderLinkedList(LinkedListNode<Integer> head) {
        if (head == null) {
            return;
        }

        // find middle
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse list from middle
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = slow;
        LinkedListNode<Integer> next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        LinkedListNode<Integer> first = head;
        LinkedListNode<Integer> second = prev;

        while (second!= null && second.next != null) {
            next = first.next;
            first.next = second;
            first = next;

            next = second.next;
            second.next = first;
            second = next;
        }
    }
}
