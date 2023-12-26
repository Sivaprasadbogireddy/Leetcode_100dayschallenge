class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1=new HashMap<>();
        Map<String, Character> map2=new HashMap<>();
        String[] str=s.split(" ");
        if(str.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<str.length;i++){
            char ch=pattern.charAt(i);
            if (!map1.containsKey(ch)) {
                map1.put(ch, str[i]);
            }
            if (!map2.containsKey(str[i])) {
                map2.put(str[i], ch);
            }
            if (!map1.get(ch).equals(str[i]) || !map2.get(str[i]).equals(ch)) {
                return false;
            }
        }
        return true;
    }
}