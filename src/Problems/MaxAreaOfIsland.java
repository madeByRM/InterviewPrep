package Problems;

import java.util.Stack;

public class MaxAreaOfIsland {
    public static int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[n][m];
        stack.push(new int[]{0,0});

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int currIslandSize = 0;
                    stack.push(new int[]{i, j});
                    visited[i][j] = true;

                    while (!stack.isEmpty()) {
                        int[] currCell = stack.pop();
                        int currRow = currCell[0];
                        int currCol = currCell[1];
                        currIslandSize++;

                        for (int[] dir : directions) {
                            int newRow = currRow + dir[0];
                            int newCol = currCol + dir[1];
                            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m &&
                                    grid[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                                stack.push(new int[]{newRow, newCol});
                                visited[newRow][newCol] = true;
                            }
                        }
                    }
                    maxArea = Math.max(maxArea, currIslandSize);
                }
            }
        }
        return maxArea;
    }

    private static boolean[][] visited;
    private static int[][] inputGrid;
    private static final int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static int maxAreaOfIslandDFS(int[][] grid) {
        inputGrid = grid;
        int n = inputGrid.length;
        int m = inputGrid[0].length;
        visited = new boolean[n][m];

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxArea = Math.max(maxArea, DFS(i, j));
            }
        }
        return maxArea;
    }

    private static int DFS(int currRow, int currCol){
        if (currRow >= inputGrid.length || currRow < 0 || currCol >= inputGrid[0].length || currCol < 0
                || inputGrid[currRow][currCol] != 1 || visited[currRow][currCol]) {
            return 0;
        }

        visited[currRow][currCol] = true;
        int currArea = 1;

        for (int[] dir : directions) {
            int newRow = currRow + dir[0];
            int newCol = currCol + dir[1];
            currArea += DFS(newRow, newCol);
        }
        return currArea;
    }
}
