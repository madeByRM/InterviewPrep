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
}
