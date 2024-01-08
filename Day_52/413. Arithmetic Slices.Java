class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int res=0;
        if(n<3){
            return 0;
        }
        for(int i=0;i<n-2;i++){
            if(i+2<n && nums[i+1]-nums[i]==nums[i+2]-nums[i+1]){
                int diff=nums[i+1]-nums[i];
                res++;
                for(int j=i+2;j<n-1 && nums[j+1]-nums[j]==diff;j++){
                    res++;
                }
            }
        }
        return res;
    }
}