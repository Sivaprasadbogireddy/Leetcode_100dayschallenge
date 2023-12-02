class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int n:nums){
            if(map.containsKey(n)){
                res.add(n);
            }
            else{
                map.put(n, 1);
            }
        }
        return res;
    }
}