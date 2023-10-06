package Problems;

public class RotateImage {
    private static int N;
    /*
        Time Complexity: O(N^2)  |  O(M) where M = number of cells in the matrix.
        Space Complexity: O(1)
     */
    public static void rotate(int[][] matrix) {
        N = matrix.length;
        transpose(matrix);
        reflect(matrix);
    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reflect(int[][] matrix) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = matrix[i][j];
                // Here, N-1-j represents the corresponding column on the opposite side of the matrix.
                // So, if j represents the leftmost column, N-1-j represents the rightmost column, and vice versa.
                matrix[i][j] = matrix[i][N - 1 - j];
                matrix[i][N - 1 - j] = temp;
            }
        }
    }
}
