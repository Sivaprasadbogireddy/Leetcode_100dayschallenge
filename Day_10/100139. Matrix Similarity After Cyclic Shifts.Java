class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] shiftedMatrix = new int[mat.length][mat[0].length];

        // Copy the original matrix to the shifted matrix
        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(mat[i], 0, shiftedMatrix[i], 0, mat[i].length);
        }

        while (k > 0) {
            for (int i = 0; i < mat.length; i++) {
                if (i % 2 != 0) {
                    rightShiftRow(shiftedMatrix[i]);
                } else {
                    leftShiftRow(shiftedMatrix[i]);
                }
            }
            k--;
        }

        // Now check if the final shifted matrix is equal to the original one
        return areMatricesEqual(mat, shiftedMatrix);
    }

    public static void rightShiftRow(int[] row) {
        // Perform the right shift
        int lastElement = row[row.length - 1];
        System.arraycopy(row, 0, row, 1, row.length - 1);
        row[0] = lastElement;
    }

    public static void leftShiftRow(int[] row) {
        // Perform the left shift
        int firstElement = row[0];
        System.arraycopy(row, 1, row, 0, row.length - 1);
        row[row.length - 1] = firstElement;
    }

    public static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        // Check if matrices have the same dimensions
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
