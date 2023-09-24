package Problems;

import Helper.LinkedListNode;

public class AddTwoNumbers {
    public static LinkedListNode<Integer> addTwoNumbers(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2) {
        // Create a dummy head node to simplify the code and represent the result.
        LinkedListNode<Integer> dummyHead = new LinkedListNode<>(0);
        // Initialize a pointer 'curr' to the dummy head.
        LinkedListNode<Integer> curr = dummyHead;
        // Initialize a 'carry' variable to hold any carry-over value.
        int carry = 0;

        // Main loop: Continue until there are no more digits to add, and carry is 0.
        while (l1 != null || l2 != null || carry != 0) {
            // Get the current digits from l1 and l2 (default to 0 if null).
            int x = (l1 != null) ? l1.value : 0;
            int y = (l2 != null) ? l2.value : 0;
            // Calculate the sum of current digits and the carry-over.
            int sum = carry + x + y;
            // Calculate the new carry-over value.
            carry = sum / 10;
            // Create a new node with the units digit of the sum and attach it to 'curr.next'.
            curr.next = new LinkedListNode<>(sum % 10);
            // Move 'curr' to the newly created node.
            curr = curr.next;
            // Move 'l1' and 'l2' pointers to the next digits (if available).
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the actual result linked list, starting from the first digit.
        return dummyHead.next;
    }
}
