package Helper;

public class UnionFind {
    private int[] root;

    public UnionFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public int find(int x) {
        return root[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        // If the roots are equal, x and y are already connected
        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                // If an element is part of the set with rootY as its root,
                // update its root to be rootX, effectively merging the two sets.
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    public boolean isConnected (int x, int y) {
        return find(x) == find(y);
    }

}
