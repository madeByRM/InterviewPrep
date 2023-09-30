package Test;

import Helper.UnionFind;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnionFindTest {
    @Test
    public void testUnionFind() {
        // Create a UnionFind instance with a size of 5
        UnionFind uf = new UnionFind(5);

        // Initially, no elements should be connected
        assertFalse(uf.isConnected(0, 1));
        assertFalse(uf.isConnected(2, 3));

        // Perform some union operations
        uf.union(0, 1);
        uf.union(2, 3);

        // After union operations, elements in the same set should be connected
        assertTrue(uf.isConnected(0, 1));
        assertTrue(uf.isConnected(2, 3));

        // Elements from different sets should not be connected
        assertFalse(uf.isConnected(0, 2));
        assertFalse(uf.isConnected(1, 3));
    }
}
