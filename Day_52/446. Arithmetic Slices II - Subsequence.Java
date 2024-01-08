class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int length = nums.length;
        int result = 0;
        Map<Integer, Integer>[] dp = new Map[length];

        for (int i = 0; i < length; i++) {
            dp[i] = new HashMap<>();
            int j = 0;
            
            while (j < i) {
                long difference = (long) nums[j] - (long) nums[i];
                if (difference <= Integer.MIN_VALUE || difference > Integer.MAX_VALUE) {
                    j++;
                    continue;
                }

                int diff = (int) difference;
                int countAtI = dp[i].getOrDefault(diff, 0);  // Arithmetic progressions ending at i
                int countAtJ = dp[j].getOrDefault(diff, 0);  // Arithmetic progressions ending at j
                result += countAtJ;

                dp[i].put(diff, countAtI + countAtJ + 1);
                j++;
            }
        }

        return result;
    }
}
