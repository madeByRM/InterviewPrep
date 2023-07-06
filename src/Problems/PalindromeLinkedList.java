package Problems;

import Helper.LinkedListNode;

public class PalindromeLinkedList {
    public static boolean isPalindromeLL(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    private static LinkedListNode<Integer> reverseAndClone(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> newHead = null;
        while (head != null) {
            LinkedListNode<Integer> n = new LinkedListNode<Integer>(head.value);
            n.next = newHead;
            newHead = n;
            head = head.next;
        }
        return newHead;
    }

    private static boolean isEqual(LinkedListNode<Integer> one, LinkedListNode<Integer> two) {
        while (one != null && two != null) {
            if (one.value != two.value) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }
}
