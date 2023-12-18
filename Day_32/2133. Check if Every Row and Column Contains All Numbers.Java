class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        if(n==1){
            return true;
        }
        int[][] trans=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                trans[i][j]=matrix[j][i];
            }
        }

        for(int[] row:matrix){
            Arrays.sort(row);
            for(int i=0;i<row.length-1;i++){
                if(row[i]==row[i+1]){
                    return false;
                }
            }
        }
        for(int[] col:trans){
            Arrays.sort(col);
            for(int i=0;i<col.length-1;i++){
                if(col[i]==col[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}