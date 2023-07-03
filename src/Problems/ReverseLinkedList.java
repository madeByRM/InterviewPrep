package Problems;

import Helper.LinkedListNode;

public class ReverseLinkedList {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        if (head == null) {
            return null;
        }

        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
