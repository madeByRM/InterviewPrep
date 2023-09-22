package Problems;

import Helper.LinkedListNode;

public class MergeTwoSortedLists {
    public LinkedListNode<Integer> mergeTwoLists(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
        // Create a dummy node to represent the head of the merged list.
        LinkedListNode<Integer> mergedList = new LinkedListNode<>(0);
        LinkedListNode<Integer> curr = mergedList;

        // Traverse both input lists until one of them becomes null.
        while (list1 != null && list2 != null) {
            // Compare the values of the current nodes in both lists.
            if (list1.value <= list2.value) {
                // If the value in list1 is smaller (or equal), append list1's node to the merged list.
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // At this point, one of the input lists may still have remaining nodes.
        // Append the remaining nodes (if any) to the merged list.
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        return mergedList.next;
    }
}
