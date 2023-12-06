class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map=new HashMap<>();
        for(char ch:num.toCharArray()){
            int tmp=Character.getNumericValue(ch);
            if(!map.containsKey(tmp)){
                map.put(tmp, 1);
            }
            else{
                map.put(tmp, map.get(tmp)+1);
            }
        }
        for(int i=0;i<num.length();i++){
            int t=map.containsKey(i)?map.get(i):0;
            if(t!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}