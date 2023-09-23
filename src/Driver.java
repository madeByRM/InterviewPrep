import Helper.*;
import Problems.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        /* 1. Two Sum: https://leetcode.com/problems/two-sum */
        twoSum();

        /* 167. Two Sum II - Input Array Is Sorted: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted */
        twoSumII();

        /* 15. 3Sum: https://leetcode.com/problems/3sum/ */
        threeSum();

        /* 217. Contains Duplicate: https://leetcode.com/problems/contains-duplicate/ */
        containsDuplicate();

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

        /* 19. Remove Nth Node From End of List: https://leetcode.com/problems/remove-nth-node-from-end-of-list/ */
        removeNthFromEndLL();

        /* 206. Reverse Linked List: https://leetcode.com/problems/reverse-linked-list/ */
        reverseLinkedList();

        /* 143. Reorder List: https://leetcode.com/problems/reorder-list/ */
        reorderLinkedList();

        /* 234. Palindrome Linked List: https://leetcode.com/problems/palindrome-linked-list/ */
        isPalindromeLL();

        /* 138. Copy List with Random Pointer: https://leetcode.com/problems/copy-list-with-random-pointer/ */
        copyListWithRandomPointer();

        /* 2. Add Two Numbers: https://leetcode.com/problems/add-two-numbers/ */
        addTwoNumbers();

        /* 141. Linked List Cycle: https://leetcode.com/problems/linked-list-cycle/*/
        linkedListCycle();

        /* Check for Binary Tree is SumTree: https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/ */
        isSumTree();

        /* Binary Tree cousin nodes: https://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/ */
        areNodesCousins();

        /* Binary Tree Max Path Sum: https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/ */
        maximumPathSumBT();

        /* 104. Maximum Depth of Binary Tree: https://leetcode.com/problems/maximum-depth-of-binary-tree/ */
        maximumDepthBT();

        /* 100. Same Tree: https://leetcode.com/problems/same-tree/ */
        sameTree();

        /* 572. Subtree of Another Tree: https://leetcode.com/problems/subtree-of-another-tree/ */
        isSubtree();

        /* 235. Lowest Common Ancestor of a Binary Search Tree: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ */
        getLCAofBST();

        /* 236. Lowest Common Ancestor of a Binary Tree: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree */
        getLCAofBT();

        /* 102. Binary Tree Level Order Traversal: https://leetcode.com/problems/binary-tree-level-order-traversal/ */
        traverseLevelOrderBT();

        /* 98. Validate Binary Search Tree: https://leetcode.com/problems/validate-binary-search-tree/ */
        validateBST();

        /* 105. Construct Binary Tree from Preorder and Inorder Traversal: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/ */
        constructBTfromPreInorderTraversal();

        /* 261. Graph Valid Tree: https://leetcode.com/problems/graph-valid-tree/ */
        validateGraphIsTree();

        /* 238. Product of Array Except Self: https://leetcode.com/problems/product-of-array-except-self/ */
        productExceptSelf();

        /* 53. Maximum SubArray: https://leetcode.com/problems/maximum-subarray/description/ */
        maxSubArray();

        /* 153. Find Minimum in Rotated Sorted Array: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/ */
        findMinInRotatedArray();

        /* 33. Search in Rotated Sorted Array: https://leetcode.com/problems/search-in-rotated-sorted-array/ */
        findTargetInRotatedArray();

        /* 11. Container With Most Water: https://leetcode.com/problems/container-with-most-water/ */
        containerWithMostWater();

        /* 70. Climbing Stairs: https://leetcode.com/problems/climbing-stairs/ */
        climbStairs();

        /* 198. House Robber: https://leetcode.com/problems/house-robber/ */
        houseRobber();

        /* 213. House Robber II: https://leetcode.com/problems/house-robber-ii/ */
        houseRobberII();

        /* 1143. Longest Common Subsequence: https://leetcode.com/problems/longest-common-subsequence/ */
        longestCommonSubsequence();

        /* 128. Longest Consecutive Sequence: https://leetcode.com/problems/longest-consecutive-sequence/ */
        longestConsecutiveSequence();

        /* 300. Longest Increasing Subsequence: https://leetcode.com/problems/longest-increasing-subsequence/ */
        longestIncreasingSubsequence();

        /* 200. Number of Islands: https://leetcode.com/problems/number-of-islands/ */
        numberOfIslands();

        /* 253. Meeting Rooms II: https://leetcode.com/problems/meeting-rooms-ii/ */
        meetingRoomsII();

        /* 388. Longest Absolute File Path: https://leetcode.com/problems/longest-absolute-file-path/ */
        longestAbsoluteFilePath();

        /* 690. Employee Importance: https://leetcode.com/problems/employee-importance/ */
        employeeImportance();

        /* 365. Water and Jug Problem: https://leetcode.com/problems/water-and-jug-problem/ */
        waterAndJugProblem();

        /* 7. Reverse Integer: https://leetcode.com/problems/reverse-integer/ */
        reverseInteger();

        /* 49. Group Anagrams: https://leetcode.com/problems/group-anagrams/ */
        groupAnagrams();

        /* 347. Top K Frequent Elements: https://leetcode.com/problems/top-k-frequent-elements/ */
        topKFrequentElements();

        /* 36. Valid Sudoku: https://leetcode.com/problems/valid-sudoku/ */
        validSudoku();

        /* 271. Encode and Decode Strings: https://leetcode.com/problems/encode-and-decode-strings/ */
        encodeDecodeStrings();

        /* 42. Trapping Rain Water: https://leetcode.com/problems/trapping-rain-water/ */
        trappingRainWater();

        /* 3. Longest Substring W/o Repeating Chars: https://leetcode.com/problems/longest-substring-without-repeating-characters/ */
        longestSubstringWoRepeat();

        /* 424. Longest Repeating Character Replacement: https://leetcode.com/problems/longest-repeating-character-replacement/ */
        longestRepeatingCharReplacement();

        /* 567. Permutation in String: https://leetcode.com/problems/permutation-in-string/ */
        permutationInString();

        /* 20. Valid Parentheses: https://leetcode.com/problems/valid-parentheses/ */
        validParentheses();

        /* 76. Minimum Window Substring: https://leetcode.com/problems/minimum-window-substring/ */
        minimumWindowSubstring();

        /* 239. Sliding Window Maximum: https://leetcode.com/problems/sliding-window-maximum/ */
        slidingWindowMaximum();

        /* 155. Min Stack: https://leetcode.com/problems/min-stack/ */
        minStack();

        /* 150. Evaluate Reverse Polish Notation */
        evaluateRPN();

        /* 22. Generate Parentheses: https://leetcode.com/problems/generate-parentheses/ */
        generateParentheses();

        /* 739. Daily Temperatures: */
        dailyTemperatures();

        /* 853. Car Fleet: https://leetcode.com/problems/car-fleet/ */
        carFleet();

        /* 84. Largest Rectangle in Histogram: https://leetcode.com/problems/largest-rectangle-in-histogram/ */
        largestRectangleHistogram();

        /* 74. Search a 2D Matrix: https://leetcode.com/problems/search-a-2d-matrix/ */
        search2DMatrix();

        /* 875. Koko Eating Bananas: https://leetcode.com/problems/koko-eating-bananas/ */
        eatingBananas();

        /* 981. Time Based Key-Value Store: https://leetcode.com/problems/time-based-key-value-store/ */
        timeBasedKeyValueStore();

        /* 4. Median of Two Sorted Arrays: https://leetcode.com/problems/median-of-two-sorted-arrays/ */
        medianOfTwoSortedArrays();

    }

    public static void twoSum() {
        System.out.println("twoSum::indexes: " +
                Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static void twoSumII() {
        System.out.println("twoSumII::indexes: " +
                Arrays.toString(TwoSumII.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static void threeSum() {
        System.out.println("threeSum::triplets: " + ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static void containsDuplicate() {
        System.out.println("containsDuplicate::duplicates: "
                + ContainDuplicates.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static void mergeTwoSortedLists() {
        CustomLinkedList<Integer> list1 = linkedListBuilder(new int[]{1, 2, 4});
        CustomLinkedList<Integer> list2 = linkedListBuilder(new int[]{1, 3, 4});
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
        BinaryTree binaryTree = binaryTreeBuilder();
        System.out.println("invertBinaryTree::Input");
        binaryTree.printTree();
        InvertBinaryTree ibt = new InvertBinaryTree();
        ibt.invertTree(binaryTree.getRoot());
        System.out.println("invertBinaryTree::Output");
        binaryTree.printTree();
    }

    public static void balancedBinaryTree() {
        BinaryTree binaryTree = binaryTreeBuilder();
        System.out.println("balancedBinaryTree::Input");
        binaryTree.printTree();
        System.out.println("balancedBinaryTree::isBalanced: " + BalancedBinaryTree.isBalanced(binaryTree.getRoot()));
    }

    public static void decodeString() {
        System.out.println("decodeString::Decoded: " + DecodeString.decodeString("10[rm]"));
    }

    public static void removeDuplicateFromSortedLL() {
        CustomLinkedList<Integer> list = linkedListBuilder(new int[]{1, 2, 4, 4, 5, 6, 6});
        RemoveDuplicatesLL.removeDuplicatesFromUnsortedLinkedList(list.getHead());
        System.out.print("removeDuplicateFromSortedLL::New List: ");
        LinkedListNode<Integer> newHead = list.getHead();
        newHead.printListFromNode(newHead);
    }

    public static void removeNthFromEndLL() {
        CustomLinkedList<Integer> list = linkedListBuilder(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        LinkedListNode<Integer> newHead = RemoveNthFromEnd.removeNthFromLast(list.getHead(), 2);
        System.out.print("removeNthFromLastLL::New List: ");
        newHead.printListFromNode(newHead);
    }

    public static void reverseLinkedList() {
        CustomLinkedList<Integer> list = linkedListBuilder(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        LinkedListNode<Integer> reverseHead = ReverseLinkedList.reverseLinkedList(list.getHead());
        System.out.print("reverseLinkedList::Reversed List: ");
        reverseHead.printListFromNode(reverseHead);
    }

    public static void reorderLinkedList() {
        CustomLinkedList<Integer> list = linkedListBuilder(new int[]{1, 2, 3, 4, 5});
        ReorderLinkedList.reorderLinkedList(list.getHead());
        System.out.print("reorderLinkedList::Reordered List: ");
        (list.getHead()).printListFromNode(list.getHead());
    }

    public static void isPalindromeLL() {
        CustomLinkedList<Integer> list = linkedListBuilder(new int[]{1, 1, 1, 1});
        System.out.println("isPalindromeLL::isPalindrome: " + PalindromeLinkedList.isPalindromeLL(list.getHead()));
    }

    private static void copyListWithRandomPointer() {
        CustomLinkedList<Integer> list = linkedListBuilder(new int[]{1, 1, 1, 1});
        System.out.println("copyListWithRandomPointer::copiedList: " + CopyList.copyRandomList(list.getHead()));
    }

    public static void addTwoNumbers() {
        CustomLinkedList<Integer> list1 = linkedListBuilder(new int[] {2, 4, 3});
        CustomLinkedList<Integer> list2 = linkedListBuilder(new int[] {5, 6, 4});
        LinkedListNode<Integer> result = AddTwoNumbers.addTwoNumbers(list1.getHead(), list2.getHead());
        System.out.print("addTwoNumbers::result: ");
        result.printListFromNode(result);
    }

    // cycle not implemented
    public static void linkedListCycle() {
        CustomLinkedList<Integer> list = linkedListBuilder(new int[]{1, 1, 1, 1});
        System.out.println("linkedListCycle::result: " + LinkedListCycle.hasCycle(list.getHead()));
    }

    public static void isSumTree() {
        BinaryTree tree = binaryTreeBuilder();
        System.out.println("isSumTree::isSumTree: " + BinarySumTree.isSumTree(tree.getRoot()));
    }

    public static void areNodesCousins() {
        BinaryTree tree = binaryTreeBuilder();
        BinaryTreeNode node1, node2;
        node1 = tree.root.left.left;
        node2 = tree.root.right.right;
        System.out.println("areNodesCousins::Cousins: " + BinaryTreeCousinNodes.areCousins(tree.getRoot(), node1, node2));
    }

    public static void maximumPathSumBT() {
        BinaryTree tree = binaryTreeBuilder();
        System.out.println("maximumPathSumBT::maxSum: " + MaximumPathSumBT.maxSum(tree.getRoot()));
    }

    public static void maximumDepthBT() {
        BinaryTree tree = binaryTreeBuilder();
        System.out.println("maximumDepthBT::maxDepth: " + MaximumDepthBT.maxDepth(tree.getRoot()));
    }

    public static void sameTree() {
        BinaryTree tree = binaryTreeBuilder();
        BinaryTree tree2 = binaryTreeBuilder();
        tree.root.right.left.right.left = new BinaryTreeNode(9);
        System.out.println("sameTree::same: " + SameTree.areTreesSame(tree.getRoot(), tree2.getRoot()));
    }

    public static void isSubtree() {
        BinaryTree tree = binaryTreeBuilder();
        BinaryTree tree2 = binaryTreeBuilder();
        tree.root.right.left.right.left = new BinaryTreeNode(9);
        System.out.println("isSubtree::subTree: " + SubtreeOfAnotherTree.isSubtree(tree.getRoot(), tree2.getRoot()));
    }

    public static void getLCAofBST() {
        BinaryTree bst = binarySearchTreeBuilder();
        BinaryTreeNode n1 = new BinaryTreeNode(2);
        BinaryTreeNode n2 = new BinaryTreeNode(4);
        System.out.println("getLCAofBST::LCA: " + (LCAofBST.lowestCommonAncestor(bst.getRoot(), n1, n2)).val);
    }

    public static void getLCAofBT() {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTreeNode(3);
        tree.root.left = new BinaryTreeNode(5);
        tree.root.right = new BinaryTreeNode(1);
        tree.root.left.left = new BinaryTreeNode(6);
        tree.root.left.right = new BinaryTreeNode(2);
        tree.root.right.left = new BinaryTreeNode(0);
        tree.root.right.right = new BinaryTreeNode(8);
        tree.root.left.right.left = new BinaryTreeNode(7);
        tree.root.left.right.right = new BinaryTreeNode(4);

        BinaryTreeNode n1 = new BinaryTreeNode(5);
        BinaryTreeNode n2 = new BinaryTreeNode(4);
        System.out.println("getLCAofBT::LCA: " + (LCAofBT.LCAofBToptimum(tree.getRoot(), n1, n2)).val);
    }

    public static void traverseLevelOrderBT() {
        BinaryTree tree = binaryTreeBuilder();
        System.out.println("traverseLevelOrderBT::out: " + (BinaryTreeLevelOrder.traverse(tree.getRoot())));
    }

    public static void validateBST() {
        BinaryTree bst = binarySearchTreeBuilder();
        System.out.println("validateBST::isBST: " + ValidateBST.isValidBST(bst.getRoot()));
    }

    public static void constructBTfromPreInorderTraversal() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        BinaryTree tree = new BinaryTree();
        tree.root = ConstructBinaryTree.fromPreorderAndInorder(preorder, inorder);
        System.out.println("traverseLevelOrderBT::out: ");
        tree.printTree();
    }

    public static void validateGraphIsTree() {
        int n = 5;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}};
        System.out.println("validateGraphIsTree::isTree: " + IsGraphTree.validateTree(n, edges));
    }

    public static void productExceptSelf() {
        System.out.println("productExceptSelf::productArray: " +
                Arrays.toString(ProductExceptSelf.productExceptSelfSpaceOptimized(new int[]{1, 2, 3, 4})));
    }

    public static void maxSubArray() {
        System.out.println("maxSubArray::maxSum: " + MaxSumSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static void findMinInRotatedArray() {
        System.out.println("findMinInRotatedArray::min: " + FindMinRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 1, 2}));
    }

    public static void findTargetInRotatedArray() {
        System.out.println("findTargetInRotatedArray::index: " +
                FindInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public static void containerWithMostWater() {
        System.out.println("containerWithMostWater::maxArea: " +
                ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static void climbStairs() {
        System.out.println("climbStairs::top-down: " + ClimbingStairs.topDown(10));
    }

    public static void houseRobber() {
        System.out.println("houseRobber::max: " + HouseRobber.rob(new int[]{2, 1, 1, 2}));
    }

    public static void houseRobberII() {
        System.out.println("houseRobberII::max: " + HouseRobberII.rob(new int[]{1, 2, 3, 1}));
    }

    public static void longestCommonSubsequence() {
        System.out.println("longestCommonSubsequence::length: " + LongestCommonSubsequence.lcs("abcde", "ace"));
    }

    public static void longestConsecutiveSequence() {
        System.out.println("longestConsecutiveSequence::length: "
                + LongestConsecutiveSequence.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }

    public static void longestIncreasingSubsequence() {
        System.out.println("longestIncreasingSubsequence::length: " +
                LongestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    private static void numberOfIslands() {
        char[][] inputArray = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println("numberOfIslands::islands: " +
                NumberOfIslands.numIslands(inputArray));
    }

    public static void meetingRoomsII() {
        System.out.println("meetingRoomsII::minRoomsRequired: " +
                MeetingRoomsII.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
    }

    public static void longestAbsoluteFilePath() {
        System.out.println("longestAbsoluteFilePath::length: " +
                LongestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }

    public static void employeeImportance() {
        Employee e1 = new Employee(1, 5, new ArrayList<>(Arrays.asList(2, 3)));
        Employee e2 = new Employee(2, 3, new ArrayList<>(Collections.emptyList()));
        Employee e3 = new Employee(3, 3, new ArrayList<>(Collections.emptyList()));
        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3));

        System.out.println("employeeImportance::imp: " + EmployeeImportance.getImportance(list, 1));
    }

    public static void waterAndJugProblem() {
        System.out.println("waterAndJugProblem::canBeFilled: " +
                WaterAndJug.canMeasureWater(3, 5, 4));
    }

    public static void reverseInteger() {
        System.out.println("reverseInteger::reversed: " + ReverseInteger.reverse(-123));
    }

    public static void groupAnagrams() {
        System.out.println("groupAnagrams::groups: " +
                GroupAnagrams.group(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static void topKFrequentElements() {
        System.out.println("topKFrequentElements::topElements: " +
                Arrays.toString(TopFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }

    public static void validSudoku() {
        System.out.println("validSudoku::isValid: " + ValidSudoku.isValidSudoku(new char[][]
                       {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
    }

    public static void encodeDecodeStrings() {
        EncodeDecodeStrings codec = new EncodeDecodeStrings();
        System.out.println("encodeDecodeStrings::decodedString: " +
                codec.decode(codec.encode(new ArrayList<>(Arrays.asList("Hello","World")))));
    }

    public static void trappingRainWater() {
        System.out.println("trappingRainWater::max: " + TrappingRainWater.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static void longestSubstringWoRepeat() {
        System.out.println("longestSubstringWoRepeat::length: "
                + LongestSsWoRepeatingChars.lengthOfLongestSubstring("abcabcbb"));
    }

    public static void longestRepeatingCharReplacement() {
        System.out.println("longestRepeatingCharReplacement::length: " +
                LongestRepeatingCharReplace.characterReplacement("AABABBA", 1));
    }

    public static void permutationInString() {
        System.out.println("permutationInString::perm: " + PermutationInString.checkInclusion("ab", "eidbaooo"));
    }

    public static void validParentheses() {
        System.out.println("validParentheses::isValid: " + ValidParentheses.isValid("()[]{}"));
    }

    public static void minimumWindowSubstring() {
        System.out.println("minimumWindowSubstring::minWindow: "
                + MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }

    public static void slidingWindowMaximum() {
        System.out.println("slidingWindowMaximum::maxInWindow: "
                + Arrays.toString(SlidingWindowMaximum.maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    public static void minStack() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(100);
        minStack.push(-100);
        System.out.println("minStack::min: " + minStack.getMin());
    }

    public static void evaluateRPN() {
        System.out.println("evaluateRPN::ans: "
                + ReversePolishNotation.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static void generateParentheses() {
        System.out.println("generateParentheses::parentheses: " + GenerateParentheses.generateParenthesis(3));
    }

    public static void dailyTemperatures() {
        System.out.println("dailyTemperatures::tempChanges: "
                + Arrays.toString(DailyTemperatures.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73})));
    }

    public static void carFleet() {
        System.out.println("carFleet::numOfCars: "
                + CarFleet.carFleet(12, new int[] {10, 8, 0, 5, 3}, new int[] {2, 4, 1, 1, 3}));
    }

    public static void largestRectangleHistogram() {
        System.out.println("largestRectangleHistogram::largestArea: "
                + LargestRectangleHistogram.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
    }

    public static void search2DMatrix() {
        System.out.println("search2DMatrix::inMatrix: "
                + Search2DMatrix.searchMatrix(new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3));
    }

    public static void eatingBananas() {
        System.out.println("eatingBananas::minBPH: "
                + KokoEatingBananas.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5));
    }

    public static void timeBasedKeyValueStore() {
        TimeBasedStore timeMap = new TimeBasedStore();
        timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
        timeMap.get("foo", 1);         // return "bar"
        timeMap.get("foo", 3);         // return "bar"
        timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
        timeMap.get("foo", 4);         // return "bar2"
        timeMap.get("foo", 5);         // return "bar2"
        System.out.println("timeBasedKeyValueStore::value: " + timeMap);
    }

    public static void medianOfTwoSortedArrays() {
        System.out.println("medianOfTwoSortedArrays::median: "
                + MedianTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    public static BinaryTree binaryTreeBuilder() {
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
        return tree;
    }

    public static CustomLinkedList<Integer> linkedListBuilder(int[] arr) {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        for (int i : arr) {
            customLinkedList.add(i);
        }
        return customLinkedList;
    }

    public static BinaryTree binarySearchTreeBuilder() {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTreeNode(6);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(8);
        tree.root.left.left = new BinaryTreeNode(0);
        tree.root.left.right = new BinaryTreeNode(4);
        tree.root.left.right.left = new BinaryTreeNode(3);
        tree.root.left.right.right = new BinaryTreeNode(5);
        tree.root.right.left = new BinaryTreeNode(7);
        tree.root.right.right = new BinaryTreeNode(9);

        return tree;
    }

}