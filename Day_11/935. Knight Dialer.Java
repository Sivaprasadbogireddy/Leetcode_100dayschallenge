class Solution {
    private static final int MOD = 1_000_000_007;

    public int knightDialer(int n) {
        int[][] moves = {
            {4, 6}, // 0
            {6, 8}, // 1
            {7, 9}, // 2
            {4, 8}, // 3
            {0, 3, 9}, // 4
            {}, // 5 (no valid moves)
            {0, 1, 7}, // 6
            {2, 6}, // 7
            {1, 3}, // 8
            {2, 4}  // 9
        };

        int[][] dp = new int[n][10];

        // Initialize base case: 1 way to start from any digit at step 0
        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }

        // Dynamic programming to count the number of ways at each step
        for (int step = 1; step < n; step++) {
            for (int digit = 0; digit < 10; digit++) {
                for (int move : moves[digit]) {
                    dp[step][digit] = (dp[step][digit] + dp[step - 1][move]) % MOD;
                }
            }
        }

        // Sum up the number of ways to reach each digit at the final step
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[n - 1][i]) % MOD;
        }

        return result;
    }
}
