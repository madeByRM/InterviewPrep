package Problems;

import Helper.LinkedListNode;

public class PalindromeLinkedList {
    public static boolean isPalindromeLL(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        // finding middle of the list
        while (fast != null  && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half of the list
        LinkedListNode<Integer> secondHalf = reverse(slow);

        while (secondHalf != null && head != null) {
            if (head.value != secondHalf.value) {
                return false;
            }
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        while (head != null) {
            LinkedListNode<Integer> next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
