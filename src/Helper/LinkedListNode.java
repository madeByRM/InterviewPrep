package Helper;

public class LinkedListNode<T> {

    public LinkedListNode<T> next;
    public T value;

    public LinkedListNode(T value) {
        this.value = value;
        this.next = null;
    }

    public void printListFromNode(LinkedListNode node) {
        LinkedListNode<T> curr = node;
        while (curr.next != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.print(curr.value + " ");
        System.out.println();
    }
}
