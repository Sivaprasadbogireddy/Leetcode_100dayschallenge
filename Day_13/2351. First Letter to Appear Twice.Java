class Solution {
    public char repeatedCharacter(String s) {
        char res=' ';
        Map<Character, Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                res=ch;
                break;
            }
        }
        return res;
    }
}