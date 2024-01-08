class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonalLength = 0;
        int maxRectangleArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];

            double currentDiagonalLength = Math.sqrt(length * length + width * width);

            if (currentDiagonalLength > maxDiagonalLength || (currentDiagonalLength == maxDiagonalLength && length * width > maxRectangleArea)) {
                maxDiagonalLength = currentDiagonalLength;
                maxRectangleArea = length * width;
            }
        }

        return maxRectangleArea;
    }
}
