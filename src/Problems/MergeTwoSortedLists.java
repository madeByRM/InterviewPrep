package Problems;

import Helper.LinkedListNode;

public class MergeTwoSortedLists {
    public LinkedListNode<Integer> mergeTwoLists(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
        LinkedListNode<Integer> mergedList = new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> curr = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        return mergedList.next;
    }
}
