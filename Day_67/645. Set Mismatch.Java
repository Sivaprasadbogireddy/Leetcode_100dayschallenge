class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] there=new int[nums.length+1];
        for(int i:nums){
            there[i]++;
        }
        int m=0, d=0;
        for(int i=1;i<nums.length+1;i++){
            if(there[i]==2){
                d=i;
            }
            if(there[i]==0){
                m=i;
            }
            if(d>0 && m>0){
                return new int[]{d,m};
            }
        }
        return new int[] {d,m};
    }
}
