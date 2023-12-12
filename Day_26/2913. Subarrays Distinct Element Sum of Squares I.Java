class Solution {
    public int sumCounts(List<Integer> nums) {
        int res = 0, n = nums.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                Set<Integer> subarray = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(nums.get(k));
                }
                res += subarray.size() * subarray.size();
            }
        }
        return res;
    }
}
