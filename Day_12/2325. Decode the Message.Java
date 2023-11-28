class Solution {
    public String decodeMessage(String key, String message) {
        key=key.replaceAll(" ","");
        char alpha='a';
        Map<Character, Character> map=new HashMap<>();
        for(int i=0;i<key.length();i++){
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),alpha++);
            }
        }
        String res="";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                res=res+" ";
            }
            else{
                res=res+map.get(message.charAt(i));
            }
        }
        return res;
    }
}