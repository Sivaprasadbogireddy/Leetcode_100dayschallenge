class Solution {
    public int rob(int[] nums) {
        int odd=0, even=0;
        for(int i=0;i<nums.length;i++){
            int evenrob=even+nums[i];
            int oddrob=Math.max(odd, even);
            odd=evenrob;
            even=oddrob;
        }
        return Math.max(odd,even);
    }
}