package Helper;

public class CustomLinkedList<T> {
    private LinkedListNode<T> head;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T value) {
        LinkedListNode<T> newNode = new LinkedListNode<>(value);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    public void remove(T value) {
        //checks if list is empty
        if (head == null) {
            return;
        }
        //checks if first element is to be removed
        if (head.value.equals(value)) {
            head = head.next;
            size--;
            return;
        }

        LinkedListNode<T> curr = head;
        LinkedListNode<T> prev = null;

        while (curr != null && !curr.value.equals(value)) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
            size--;
        }
    }

    public boolean contains(T value) {
        LinkedListNode<T> curr = head;
        while (curr != null) {
            if (curr.value.equals(value)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void printList() {
        LinkedListNode<T> curr = head;
        while (curr.next != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.print(curr.value + " ");
        System.out.println();
    }

    public LinkedListNode<T> getHead(){
        return head;
    }
}


