class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] res=new int[n+1][target+1];
        res[0][0]=1;
        for (int x=1; x<=n; x++) {
            for (int y=1; y<=target; y++) {
                for (int z=1;z<= k; z++) {
                    if (y>=z) {
                        res[x][y] = (res[x][y] + res[x- 1][y- z]) % 1000000007;
                    }
                }
            }
        }
        return res[n][target];
    }
}