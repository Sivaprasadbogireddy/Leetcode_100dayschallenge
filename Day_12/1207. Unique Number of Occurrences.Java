class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(Map.Entry <Integer, Integer> l:map.entrySet()){
            if(res.contains(l.getValue())){
                return false;
            }
            else{
                res.add(l.getValue());
            }
        }
    return true;
    }
}