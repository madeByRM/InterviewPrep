package Problems;

import Helper.LinkedListNode;

public class RemoveNthFromEnd {
    /*
    The idea is to leverage two pointers: fast and slow pointers.
    Initially, both pointers point to the start of the linked list. First, we advance the fast pointer n nodes ahead.
    Then we move both the slow and fast pointers one node a time. When the fast pointer reaches the end of the linked list,
    the slow pointer will be at the (n+1)th node from the end.
    Now, since we want to remove nth node from the end, the node to remove will be the one after the slow pointer.
    So we direct the slow pointer's next pointer to point to the next node's next node (skipping over the node to be removed),
    thus effectively removing the nth node from the end of the linked list.
     */
    public static LinkedListNode<Integer> removeNthFromLast(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> dummy = new LinkedListNode<>(0);
        dummy.next = head;
        LinkedListNode<Integer> slow = dummy;
        LinkedListNode<Integer> fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
