package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Algorithm Explanation:
-> Initialize the necessary variables and matrices.
-> Use Depth-First Search (DFS) to mark cells that are reachable from the Pacific Ocean by starting from the left and right sides of the matrix.
-> Use DFS again to mark cells that are reachable from the Atlantic Ocean by starting from the top and bottom sides of the matrix.
-> Check for common cells that are reachable from both oceans and add them to the result list.
-> Return the list of common cells as the answer.
 */
public class WaterFlow {
    private static int numOfRows;
    private static int numOfCols;
    private static final int[][] DIRECTIONS = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private static int[][] matrix;
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        if (heights.length == 0 || heights[0].length == 0) {
            return new ArrayList<>();
        }
        numOfRows = heights.length;
        numOfCols = heights[0].length;
        matrix = heights;

        boolean[][] pacificReachable = new boolean[numOfRows][numOfCols];
        boolean[][] atlanticReachable = new boolean[numOfRows][numOfCols];

        // Traverse from the left and right sides of the matrix to mark reachable cells.
        for (int i = 0; i < numOfRows; i++) {
            dfs(i, 0, pacificReachable);    // From the Pacific Ocean side
            dfs(i, numOfCols - 1, atlanticReachable);   // From the Atlantic Ocean side
        }
        // Traverse from the top and bottom sides of the matrix to mark reachable cells.
        for (int j = 0; j < numOfCols; j++) {
            dfs(0, j, pacificReachable);
            dfs(numOfRows - 1, j, atlanticReachable);
        }

        List<List<Integer>> commonCells = new ArrayList<>();

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfCols; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    commonCells.add(new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }
        return commonCells;
    }

    private static void dfs(int row, int col, boolean[][] reachable) {
        if (reachable[row][col]) {
            return; // Cell is already marked as reachable.
        }
        reachable[row][col] = true;
        for (int[] dir : DIRECTIONS) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < numOfRows && newCol >= 0 && newCol < numOfCols
                    && !reachable[newRow][newCol] && matrix[newRow][newCol] >= matrix[row][col]) {
                dfs(newRow, newCol, reachable);
            }
        }
    }
}
