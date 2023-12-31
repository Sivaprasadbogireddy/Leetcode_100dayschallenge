class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map=new HashMap<>();
        int res=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int first=s.indexOf(ch);
            int last=s.lastIndexOf(ch);
            if(!map.containsKey(ch) && last-first-1>-1){
                map.put(ch,last-first-1);
                if(last-first-1>res){
                    res=last-first-1;
                }
            }
        }
        return res;
    }
}