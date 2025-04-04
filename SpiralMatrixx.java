public class SpiralMatrixx {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(matrix);
    }
    public static int[][] printSpiral(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows * cols][1];
        int index = 0;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result[index++][0] = matrix[top][i];
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[index++][0] = matrix[i][right];
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++][0] = matrix[bottom][i];
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++][0] = matrix[i][left];
                }
                left++;
            }
        }
        return result;
    }
}
