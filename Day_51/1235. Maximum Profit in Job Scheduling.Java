import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }

        // Sort the jobs based on their end times
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));

        // dp array to store the maximum profit for each job
        int[] dp = new int[n];

        // Initialize dp array with the profit of each job
        for (int i = 0; i < n; i++) {
            dp[i] = jobs[i][2];
        }

        // Dynamic programming to find the maximum profit
        for (int i = 1; i < n; i++) {
            int prevJobIndex = binarySearch(jobs, i);
            if (prevJobIndex != -1) {
                dp[i] = Math.max(dp[i], dp[prevJobIndex] + jobs[i][2]);
            }
            // Update dp with the maximum profit so far
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }

        return dp[n - 1];
    }

    private int binarySearch(int[][] jobs, int index) {
        int low = 0;
        int high = index - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (jobs[mid][1] <= jobs[index][0]) {
                if (jobs[mid + 1][1] <= jobs[index][0]) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            } else {
                high = mid - 1;
            }
        }

        return -1; // No non-overlapping job found
    }
}
