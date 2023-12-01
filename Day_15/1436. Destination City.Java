class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map=new HashMap<>();
        String res="";
        Set<String> set=new HashSet<>();
        for(List<String> str: paths){
            map.put(str.get(0), str.get(1));
            set.add(str.get(0));
            set.add(str.get(1));
        }
        for(String str:set){
            if(!map.containsKey(str)){
                res=str;
                break;
            }
        }
        return res;
    }
}