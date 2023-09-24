package Problems;

import Helper.DoublyListNode;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    Map<Integer, DoublyListNode> map;
    DoublyListNode head;
    DoublyListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new DoublyListNode(-1, -1);
        tail = new DoublyListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        // Check if key exists in the hash map. If not, return -1.
        if (!map.containsKey(key)) {
            return -1;
        }
        // Get the node associated with key from the hash map.
        DoublyListNode node = map.get(key);
        // Move it to the back of the linked list. This can be done by first calling remove(node) and then add(node).
        remove(node);
        addToEnd(node);
        // Return the value associated with key, which is node.val.
        return node.getValue();
    }

    // This method updates key: value if it already exists, and inserts key: value otherwise.
    // If inserting causes the size to exceed capacity, we need to remove the least recently used key (which we know is the head of our linked list).
    public void put(int key, int value) {
        // First, check if key already exists in the hash map. If it does, find the node associated with it and call remove on it.
        // We are going to move the key to the back of the queue, so we need to first remove it from the linked list.
        if (map.containsKey(key)) {
            remove(map.get(key));
        }

        DoublyListNode newNode = new DoublyListNode(key, value);
        map.put(key, newNode);
        addToEnd(newNode);

        if (map.size() > capacity) {
            DoublyListNode nodeToDelete = head.next;
            map.remove(nodeToDelete.getKey());
            remove(nodeToDelete);
        }
    }

    // We need to add a node to the end of our linked list whenever we add a new key or update an existing one
    private void addToEnd(DoublyListNode node){
        // Get the current node at the end of the linked list
        DoublyListNode currEnd = tail.prev;
        // node is being inserted after currEnd. Therefore, set currEnd.next = node
        currEnd.next = node;
        // Now, we set the pointers of node. First, node.prev = currEnd.
        node.prev = currEnd;
        // Next, because the "real" tail is before tail, we set node.next = tail.
        node.next = tail;
        // Finally, we update tail.prev = node.
        tail.prev = node;
    }

    // We need to perform removals when we update/fetch an existing key, or when the data structure exceeds capacity
    private void remove(DoublyListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, DoublyListNode> entry : map.entrySet()) {
            sb.append(" ").append(entry.getKey()).append(" : ").append((entry.getValue()).getValue()).append(" ");
        }
        return sb.toString();
    }
}
