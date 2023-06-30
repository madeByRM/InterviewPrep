package Problems;

import Helper.LinkedListNode;

import java.util.HashSet;

public class RemoveDuplicatesLL {
    public static void removeDuplicatesFromUnsortedLinkedList(LinkedListNode<Integer> head) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode<Integer> prev = null;

        while (head != null) {
            if (set.contains(head.value)) {
                prev.next = head.next;
            } else {
                set.add(head.value);
                prev = head;
            }
            head = head.next;
        }
    }

    public static void removeDuplicatesFromUnsortedLlWithoutBuffer(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        while (curr != null) {
            LinkedListNode<Integer> fast = curr;
            while (fast.next != null) {
                if (fast.next.value == curr.value) {
                    fast.next = fast.next.next;
                } else {
                    fast = fast.next;
                }
            }
            curr = curr.next;
        }
    }
}
