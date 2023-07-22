package Problems;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if(!isValidRow(board, i)) {
                return false;
            }
        }

        for (int j = 0; j < 9; j++) {
            if(!isValidColumn(board, j)) {
                return false;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        boolean[] visited = new boolean[9];
        for (int j = 0; j < 9; j++) {
            if (board[row][j] != '.') {
                int num = board[row][j] - '1';
                if (visited[num]) {
                    return false;
                }
                visited[num] = true;
            }
        }
        return true;
    }

    private static boolean isValidColumn(char[][] board, int col) {
        boolean[] visited = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                int num = board[i][col] - '1';
                if (visited[num]) {
                    return false;
                }
                visited[num] = true;
            }
        }
        return true;
    }

    private static boolean isValidSubBox(char[][] board, int startRow, int startCol) {
        boolean[] visited = new boolean[9];
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (visited[num]) {
                        return false;
                    }
                    visited[num] = true;
                }
            }
        }
        return true;
    }
}
