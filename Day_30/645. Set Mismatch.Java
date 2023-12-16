class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                res[0] = num; 
            } else {
                seen.add(num);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!seen.contains(i)) {
                res[1] = i; 
                break;
            }
        }

        return res;
    }
}
