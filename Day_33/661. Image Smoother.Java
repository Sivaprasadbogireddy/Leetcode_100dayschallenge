class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length, n=img[0].length;
        int [][] res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int s=0, c=0;
                for(int k=-1;k<2;k++){
                    for(int l=-1;l<2;l++){
                        if(i+k<0 || i+k>=m ||j+l<0 || j+l>=n) {
                            continue;
                        }
                        else{
                            s+=img[i+k][j+l];
                            c++;
                        }
                    }
                }
                res[i][j]=s/c;
            }
        }
        return res;
    }
}