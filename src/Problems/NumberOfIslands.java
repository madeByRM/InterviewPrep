package Problems;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int numOfIslands = 0;

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numRows = grid.length;
        int numCols = grid[0].length;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (grid[row][col] == '1') {
                    numOfIslands++;
                    dfs(grid, row, col, numRows, numCols);
                }
            }
        }
        return numOfIslands;
    }

    private static void dfs(char[][] grid, int row, int col, int numRow, int numCol) {
        if (row < 0 || col < 0 || row >= numRow || col >= numCol || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        dfs(grid, row - 1, col, numRow, numCol);
        dfs(grid, row + 1, col, numRow, numCol);
        dfs(grid, row, col - 1, numRow, numCol);
        dfs(grid, row, col + 1, numRow, numCol);
    }

    // Higher runtime
    public static int numOfIslandsBFS(char[][] grid) {
        int numOfIslands = 0;

        if (grid == null || grid.length == 0) {
            return 0;
        }
        int numOfRows = grid.length;
        int numOfCols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfCols; col++) {
                if (grid[row][col] == '1') {
                    numOfIslands++;
                    queue.offer(new int[] {row, col});
                    grid[row][col] = '0';
                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        for (int[] dir : directions) {
                            int newRow = curr[0] + dir[0];
                            int newCol = curr[1] + dir[1];
                            if (newRow >= 0 && newRow < numOfRows && newCol >= 0 && newCol < numOfCols &&
                            grid[newRow][newCol] == '1') {
                                queue.offer(new int[] {newRow, newCol});
                                grid[newRow][newCol] = '0';
                            }
                        }
                    }
                }
            }
        }
        return numOfIslands;
    }
}
