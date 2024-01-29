class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        for (int startCol = 0; startCol < cols; startCol++) {
            for (int endCol = startCol; endCol < cols; endCol++) {
                int cumulativeSum = 0;
                HashMap<Integer, Integer> sumFrequencyMap = new HashMap<>();
                sumFrequencyMap.put(0, 1);
                for (int row = 0; row < rows; row++) {
                    cumulativeSum += matrix[row][endCol] - (startCol > 0 ? matrix[row][startCol - 1] : 0);
                    int complement = cumulativeSum - target;
                    if (sumFrequencyMap.containsKey(complement)) {
                        count += sumFrequencyMap.get(complement);
                    }

                    sumFrequencyMap.put(cumulativeSum, sumFrequencyMap.getOrDefault(cumulativeSum, 0) + 1);
                }
            }
        }

        return count;
    }
}