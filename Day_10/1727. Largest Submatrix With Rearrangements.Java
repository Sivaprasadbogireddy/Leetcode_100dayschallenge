class Solution {
    public int largestSubmatrix(int[][] arr) {
        int res = 0;
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==1){
                    arr[i][j] = arr[i-1][j]+1;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            Arrays.sort(arr[i]);
            for(int j=1; j<=arr[0].length; j++){
                res = Math.max(res,j*arr[i][arr[0].length-j]);
            }
        }
        return res;
    }
}