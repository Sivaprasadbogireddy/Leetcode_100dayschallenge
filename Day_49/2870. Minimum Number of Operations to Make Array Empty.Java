class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

       for(var m:map.values()){
           if(m==1){
               return -1;
           }

           res+=m/3;
           if(m%3!=0){
               res++;
           }
       }
        return res;
    }
}
