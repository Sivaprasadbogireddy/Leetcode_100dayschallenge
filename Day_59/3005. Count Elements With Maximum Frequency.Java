class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        int tmax=0, res=0;
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
            if(map.get(n)>tmax){
                tmax=map.get(n);
            }
        }
        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            if(e.getValue()==tmax){
                res+=tmax;
            }
        }
        return res;
        
    }
}