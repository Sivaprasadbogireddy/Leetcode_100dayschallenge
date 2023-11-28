class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        int c1=0, c2=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer, Integer> h:map.entrySet()){
            int n=h.getValue();
            c1+=n/2;
            c2+=n%2;
        }
        return new int[]{c1, c2};
    }
}