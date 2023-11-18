class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxPairSum = Integer.MIN_VALUE;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            maxPairSum = Math.max(maxPairSum, nums[i] + nums[j]);
        }

        return maxPairSum;
    }
}