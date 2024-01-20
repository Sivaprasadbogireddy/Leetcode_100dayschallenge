class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length, max;
        int[][] res=new int[n-2][n-2];
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[0].length-2;j++){
                max=0;
                for (int row = 0; row < 3; row++) {
                    for (int col = 0; col < 3; col++) {
                        max=Math.max(max,grid[i + row][j + col]);
                    }
                }
                res[i][j]=max;
            }
        }
        return res;
    }
}