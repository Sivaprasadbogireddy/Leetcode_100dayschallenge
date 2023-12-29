public class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        
        // Check if it's possible to divide jobs into 'd' days
        if (n < d) return -1;

        // Initialize the dp array
        int[][] dp = new int[d + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Base case: one day
        dp[1][n - 1] = jobDifficulty[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            dp[1][i] = Math.max(jobDifficulty[i], dp[1][i + 1]);
        }

        // Bottom-up dynamic programming
        for (int days = 2; days <= d; days++) {
            for (int i = n - days; i >= 0; i--) {
                int maxDifficulty = jobDifficulty[i];
                dp[days][i] = Integer.MAX_VALUE;

                for (int j = i; j <= n - days; j++) {
                    maxDifficulty = Math.max(maxDifficulty, jobDifficulty[j]);
                    dp[days][i] = Math.min(dp[days][i], maxDifficulty + dp[days - 1][j + 1]);
                }
            }
        }

        return dp[d][0];
    }
}
