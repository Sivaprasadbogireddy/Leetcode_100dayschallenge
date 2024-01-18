class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res=1, t=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                t++;
            }else{
                t=1;
            }
            if(t>res){
                res=t;
            }
        }
        return res;
    }
}