import Helper.BinaryTree;
import Helper.BinaryTreeNode;
import Helper.LinkedList;
import Helper.LinkedListNode;
import Problems.*;

public class Driver {
    public static void main(String[] args) {
        /* Merge Two Sorted Lists: https://leetcode.com/problems/merge-two-sorted-lists/ */
        mergeTwoSortedLists();

        /* Best Time to Buy and Sell Stock: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */
        bestTimeToBuySellStock();

        /* Valid Palindrome: https://leetcode.com/problems/valid-palindrome/ */
        validPalindrome();

        /* Valid Anagram: https://leetcode.com/problems/valid-anagram/ */
        validAnagram();

        /* Binary Search: https://leetcode.com/problems/binary-search/ */
        binarySearch();

        /* Invert Binary Tree: https://leetcode.com/problems/invert-binary-tree/ */
        invertBinaryTree();

        /* Balanced Binary Tree: https://leetcode.com/problems/balanced-binary-tree/ */
        balancedBinaryTree();

        /* Decode String: https://leetcode.com/problems/decode-string/ */
        decodeString();

        /* Remove Duplicate From Sorted Linked List: Cracking the coding interview book */
        removeDuplicateFromSortedLL();

        /* Remove Nth Element From Last In Linked List: Cracking the coding interview book */
        removeNthFromLastLL();

        /* 206. Reverse Linked List: https://leetcode.com/problems/reverse-linked-list/ */
        reverseLinkedList();

        /* 143. Reorder List: https://leetcode.com/problems/reorder-list/ */
        reorderLinkedList();

        /* 234. Palindrome Linked List: https://leetcode.com/problems/palindrome-linked-list/ */
        isPalindromeLL();

        /* Check for Binary Tree is SumTree: https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/ */
        isSumTree();

        /* Binary Tree cousin nodes: https://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/ */
        areNodesCousins();

        /* Binary Tree Max Path Sum: https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/ */
        maximumPathSumBT();
    }

    public static void mergeTwoSortedLists() {
        LinkedList<Integer> list1 = linkedListBuilder(new int[]{1, 2, 4});
        LinkedList<Integer> list2 = linkedListBuilder(new int[]{1, 3, 4});
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        LinkedListNode<Integer> ans = mergeTwoSortedLists.mergeTwoLists(list1.getHead(), list2.getHead());
        System.out.print("mergeTwoSortedLists::Merged List: ");
        ans.printListFromNode(ans);
    }

    public static void bestTimeToBuySellStock() {
        BestTimeToBuySellStock b1 = new BestTimeToBuySellStock();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println("bestTimeToBuySellStock::Max profit: " + b1.maxProfitOptimized(prices));
    }

    public static void validPalindrome() {
        ValidPalindrome v1 = new ValidPalindrome();
        System.out.println("validPalindrome::Is valid: " + v1.isPalindromeOptimized("A man, a plan, a canal: Panama"));
    }

    public static void validAnagram() {
        ValidAnagram v1 = new ValidAnagram();
        System.out.println("validAnagram::Is valid: " + v1.isAnagramOptimized("anagram", "nagaram"));
    }

    public static void binarySearch() {
        BinarySearch b1 = new BinarySearch();
        System.out.println("binarySearch::Result: " + b1.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public static void invertBinaryTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(4);
        binaryTree.insert(2);
        binaryTree.insert(7);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(6);
        binaryTree.insert(9);
        System.out.println("invertBinaryTree::Input");
        binaryTree.printTree();
        InvertBinaryTree ibt = new InvertBinaryTree();
        ibt.invertTree(binaryTree.getRoot());
        System.out.println("invertBinaryTree::Output");
        binaryTree.printTree();
    }

    public static void balancedBinaryTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new BinaryTreeNode(3);
        binaryTree.root.left = new BinaryTreeNode(9);
        binaryTree.root.right = new BinaryTreeNode(20);
        binaryTree.root.right.left = new BinaryTreeNode(15);
        binaryTree.root.right.right = new BinaryTreeNode(7);
        binaryTree.root.right.right.right = new BinaryTreeNode(5);
        System.out.println("balancedBinaryTree::Input");
        binaryTree.printTree();
        System.out.println("balancedBinaryTree::isBalanced: " + BalancedBinaryTree.isBalanced(binaryTree.getRoot()));
    }

    public static void decodeString() {
        String s = "10[rm]";
        String out = DecodeString.decodeString(s);
        System.out.println("decodeString::Decoded: " + out);
        int count = 0;
        for (char c : out.toCharArray()) {
            if (c == 'r') {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }

    public static void removeDuplicateFromSortedLL() {
        LinkedList<Integer> list = linkedListBuilder(new int[]{1, 2, 4, 4, 5, 6, 6});
        RemoveDuplicatesLL.removeDuplicatesFromUnsortedLinkedList(list.getHead());
        System.out.print("removeDuplicateFromSortedLL::New List: ");
        LinkedListNode<Integer> newHead = list.getHead();
        newHead.printListFromNode(newHead);
    }

    public static void removeNthFromLastLL() {
        LinkedList<Integer> list = linkedListBuilder(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        LinkedListNode<Integer> newHead = RemoveNthFromLast.removeNthFromLast(list.getHead(), 2);
        System.out.print("removeNthFromLastLL::New List: ");
        newHead.printListFromNode(newHead);
    }

    public static void reverseLinkedList() {
        LinkedList<Integer> list = linkedListBuilder(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        LinkedListNode<Integer> reverseHead = ReverseLinkedList.reverseLinkedList(list.getHead());
        System.out.print("reverseLinkedList::Reversed List: ");
        reverseHead.printListFromNode(reverseHead);
    }

    public static void reorderLinkedList() {
        LinkedList<Integer> list = linkedListBuilder(new int[]{1, 2, 3, 4, 5});
        ReorderLinkedList.reorderLinkedList(list.getHead());
        System.out.print("reorderLinkedList::Reordered List: ");
        (list.getHead()).printListFromNode(list.getHead());
    }

    public static void isPalindromeLL() {
        LinkedList<Integer> list = linkedListBuilder(new int[]{1, 1, 1, 1});
        System.out.print("isPalindromeLL::isPalindrome: " + PalindromeLinkedList.isPalindromeLL(list.getHead()));
    }

    public static void isSumTree() {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTreeNode(26);
        tree.root.left = new BinaryTreeNode(10);
        tree.root.right = new BinaryTreeNode(3);
        tree.root.left.left = new BinaryTreeNode(4);
        tree.root.left.right = new BinaryTreeNode(6);
        tree.root.right.right = new BinaryTreeNode(3);
        System.out.println("isSumTree::isSumTree: " + BinarySumTree.isSumTree(tree.getRoot()));
    }

    public static void areNodesCousins() {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTreeNode(1);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(3);
        tree.root.left.left = new BinaryTreeNode(4);
        tree.root.left.right = new BinaryTreeNode(5);
        tree.root.left.right.right = new BinaryTreeNode(15);
        tree.root.right.left = new BinaryTreeNode(6);
        tree.root.right.right = new BinaryTreeNode(7);
        tree.root.right.left.right = new BinaryTreeNode(8);

        BinaryTreeNode node1, node2;
        node1 = tree.root.left.left;
        node2 = tree.root.right.right;
        System.out.println("areNodesCousins::Cousins: " + BinaryTreeCousinNodes.areCousins(tree.getRoot(), node1, node2));
    }

    public static void maximumPathSumBT() {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTreeNode(10);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(10);
        tree.root.left.left = new BinaryTreeNode(20);
        tree.root.left.right = new BinaryTreeNode(1);
        tree.root.right.right = new BinaryTreeNode(-25);
        tree.root.right.right.left = new BinaryTreeNode(3);
        tree.root.right.right.right = new BinaryTreeNode(4);

        System.out.println("maximumPathSumBT::maxSum: " + MaximumPathSumBT.maxSum(tree.getRoot()));
    }

    public static LinkedList<Integer> linkedListBuilder(int[] arr) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i : arr) {
            linkedList.add(i);
        }
        return linkedList;
    }

}