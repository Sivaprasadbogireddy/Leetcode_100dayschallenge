class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int[] rone=new int[m];
        int[] rzero=new int[m];
        int[] cone=new int[n];
        int[] czero=new int[n];
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    rzero[i]++;
                    czero[j]++;
                }
                else if(grid[i][j]==1){
                    rone[i]++;
                    cone[j]++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               res[i][j]=rone[i]+cone[j]-rzero[i]-czero[j]; 
            }
        }
        return res;
    }
}