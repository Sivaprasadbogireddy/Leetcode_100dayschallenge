class Solution {
    public int minFallingPathSum(int[][] matrix) {
    int rows = matrix.length;
        int cols = matrix[0].length;
        int result = Integer.MAX_VALUE;

        HashMap<String, Integer> memoizationMap = new HashMap<>();
        
        for(int startCol=0; startCol<cols; startCol++) {
            result = Math.min(result, calculatePathSum(0, startCol, matrix, memoizationMap));
        }
        return result;
    }
    
    private int calculatePathSum(int row, int col, int[][] array, HashMap<String, Integer> memoMap) {
        if(row == array.length) return 0;
        if(col < 0 || col >= array[0].length) return Integer.MAX_VALUE;

        String key = row + "Hash" + col;
        if(memoMap.containsKey(key)) {
            return memoMap.get(key);
        }

        int option1 = calculatePathSum(row + 1, col - 1, array, memoMap);
        int option2 = calculatePathSum(row + 1, col, array, memoMap);
        int option3 = calculatePathSum(row + 1, col + 1, array, memoMap);

        memoMap.put(key, array[row][col] + Math.min(option1, Math.min(option2, option3)));
        return array[row][col] + Math.min(option1, Math.min(option2, option3));
    }
}