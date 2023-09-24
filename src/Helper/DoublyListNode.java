package Helper;

public class DoublyListNode {
    int key;
    int value;
    public DoublyListNode prev;
    public DoublyListNode next;

    public DoublyListNode(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

}
