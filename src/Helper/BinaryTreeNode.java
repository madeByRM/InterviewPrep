package Helper;

public class BinaryTreeNode {
    public int val;
    public BinaryTreeNode left, right, parent;
    private int size = 0;

    public BinaryTreeNode() {}

    public BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode(int val) {
        this.val = val;
    }

    public void insertInOrder(int d) {
        if (d <= val) {
            if (left == null) {
                setLeftChild(new BinaryTreeNode(d));
            } else {
                left.insertInOrder(d);
            }
        } else {
            if (right == null) {
                setRightChild(new BinaryTreeNode(d));
            } else {
                right.insertInOrder(d);
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public BinaryTreeNode find(int d) {
        if (d == val) {
            return this;
        } else if (d <= val) {
            return left != null? left.find(d) : null;
        } else if (d > val) {
            return right != null? right.find(d) : null;
        }
        return null;
    }

    public void setLeftChild(BinaryTreeNode left) {
        this.left = left;
        if (left != null) {
            left.parent = this;
        }
    }

    public void setRightChild(BinaryTreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }
}
