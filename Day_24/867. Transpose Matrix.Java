class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] matrix1 = new int[m][n];
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                matrix1[i][j] = matrix[j][i];
        return matrix1;
    }
}