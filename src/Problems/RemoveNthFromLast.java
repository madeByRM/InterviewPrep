package Problems;

import Helper.LinkedListNode;

public class RemoveNthFromLast {
    public static LinkedListNode<Integer> removeNthFromLast(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> dummy = new LinkedListNode<>(0);
        dummy.next = head;
        LinkedListNode<Integer> p1 = dummy;
        LinkedListNode<Integer> p2 = dummy;

        for (int i = 0; i <= n; i++) {
            p2 = p2.next;
        }

        while (p2 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        p1.next = p1.next.next;
        return dummy.next;
    }
}
