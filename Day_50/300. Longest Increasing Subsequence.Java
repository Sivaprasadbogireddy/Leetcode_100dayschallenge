class Solution {
    public int lengthOfLIS(int[] nums) {
        int res=1; // Irrespective of Array Order, there will be one element which is Increasing Order
        int n=nums.length;
        int[] increment=new int[n];
        increment[0]=nums[0];
        for(int i=1;i<n;i++){
            if(increment[res-1]<nums[i]){
                increment[res++]=nums[i];
            }
            else{
                int c=Arrays.binarySearch(increment, 0, res, nums[i]);
                // System.out.println(c);
                if(c<0){
                    c=-(c+1);
                }
                increment[c]=nums[i];
            }
        }
        return res;
    }
}