class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int res=0;
        int[][] twodarray=new int[m][n];
        for(int i=0;i<indices.length;i++){
            int r=indices[i][0], c=indices[i][1];
            for(int x=0;x<m;x++){
                for(int y=0;y<n;y++){
                    if(x==r){
                        twodarray[x][y]++;
                    }
                    if(y==c){
                        twodarray[x][y]++;
                    }
                }
            }
        }

        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                if(twodarray[x][y]%2!=0){
                    res++;
                }
            }
        }
        return res;
    }
}