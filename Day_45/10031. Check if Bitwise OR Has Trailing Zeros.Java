class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int temp=nums[i];
            for(int j=i+1;j<nums.length;j++){
                temp=temp | nums[j];
                String b=Integer.toBinaryString(temp);
                if(b.charAt(b.length()-1)=='0'){
                    return true;
                }
                
                b=Integer.toBinaryString(nums[i]|nums[j]);
                if(b.charAt(b.length()-1)=='0'){
                    return true;
                }
                
            }
        }
        return false;
    }
}