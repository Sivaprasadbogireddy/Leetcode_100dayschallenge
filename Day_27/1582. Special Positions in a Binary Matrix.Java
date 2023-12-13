class Solution {
    public int numSpecial(int[][] mat) {
        int row=mat.length, col=mat[0].length, res=0;
        int[] rowones=new int[row];
        int[] colones=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    rowones[i]++;
                    colones[j]++;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1 && rowones[i]==1 && colones[j]==1){
                   res++;
                }
            }
        }
        return res;
    }
}